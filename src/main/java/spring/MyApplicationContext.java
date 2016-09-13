package spring;

import annotation.MyResource;
import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.io.InputStream;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by yangch on 2016/9/9.
 */
public class MyApplicationContext {

    private final String DEFAULT_PATH = "applicationContext.xml";
    private String path;
    private Document document;
    private Element root;
    private Map<String, Class<?>> allBeans;

    public MyApplicationContext() {
        this.path = DEFAULT_PATH;
    }

    public MyApplicationContext(String path) {
        this.path = path;
        init();
    }

    public void init() {
        InputStream in = this.getClass().getResourceAsStream(path);
        SAXReader reader = new SAXReader();
        try {
            if (in != null) {
                document = reader.read(in);
                if (document != null) {
                    root = document.getRootElement();
                    List<Element> list = root.elements("bean");
                    if (list != null && list.size() > 0) {
                        allBeans = new HashMap<String, Class<?>>();
                        for (Element element : list) {
                            Attribute idAttr = element.attribute("id");
                            Attribute clazzAttr = element.attribute("class");
                            if (idAttr != null && clazzAttr != null) {
                                allBeans.put(idAttr.getValue(), Class.forName(clazzAttr.getValue()));
                            }
                        }
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public Object getBean(String name) {
        List<Element> list = root.elements("bean");
        if (list != null && list.size() > 0) {
            for (Element element : list) {
                List<Element> propertys = element.elements("property");
                Attribute idAttr = element.attribute("id");
                if (idAttr != null) {
                    if (idAttr.getValue().equals(name)) {
                        Attribute classAttr = element.attribute("class");
                        if (classAttr != null) {
                            String classValue = classAttr.getValue();
                            try {
                                Class<?> clazz = Class.forName(classValue);
                                Object obj = clazz.newInstance();
                                if (propertys != null && propertys.size() > 0) {
                                    for (Element property : propertys) {
                                        Attribute nameAttr = property.attribute("name");
                                        StringBuilder sb = new StringBuilder(nameAttr.getValue());
                                        sb.setCharAt(0, Character.toUpperCase(nameAttr.getValue().charAt(0)));
                                        String nameValue = sb.toString();
                                        Attribute refAttr = property.attribute("ref");
                                        Class<?> refClazz = allBeans.get(refAttr.getValue());
                                        Method setMethod = clazz.getDeclaredMethod("set" + nameValue, refClazz);
                                        //clazz.getDeclaredMethod()
                                        if (setMethod == null) {
                                            throw new Exception("setmethod is not exist");
                                        }
                                        setMethod.invoke(obj, refClazz.newInstance());
                                    }
                                }
                                return obj;
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                        }
                    }
                }
            }
        } else {
            throw new RuntimeException("bean not exist");
        }
        return null;
    }

    public Object getBeanByAnnotation(String name) throws Exception {
        List<Element> list = root.elements("bean");
        if (list != null && list.size() > 0) {
            for (Element element : list) {
                Attribute idAttr = element.attribute("id");
                if (idAttr != null) {
                    if (idAttr.getValue().equals(name)) {
                        Attribute classAttr = element.attribute("class");
                        if (classAttr != null) {
                            String classValue = classAttr.getValue();
                            Class<?> clazz = Class.forName(classValue);
                            Field[] fields = clazz.getDeclaredFields();
                            Object obj = clazz.newInstance();
                            if (fields != null && fields.length > 0) {
                                for (Field field : fields) {
                                    Annotation annotation = field.getAnnotation(MyResource.class);
                                    if (annotation != null) {
                                        Class<?> fieldClass = allBeans.get(field.getName());
                                        if (fieldClass != null) {
                                            field.setAccessible(true);
                                            field.set(obj, fieldClass.newInstance());
                                        }
                                    }
                                }
                            }
                            return obj;
                        }
                    }
                }
            }
        } else {
            throw new RuntimeException("bean not exist");
        }
        return null;
    }
}
