package com.glory.service.study.classloader;

import java.io.*;

/**
 * Created by yangch on 2016/11/1 0001.
 */
public class MyClassLoader extends ClassLoader {
    /**
     * 获取Class对象
     */
    @Override
    protected Class<?> findClass(String name) throws ClassNotFoundException {
        byte[] data = loaderClassData(name);
        return this.defineClass(name, data, 0, data.length);
    }

    /**
     * 获取.class文件的字节数组
     *
     * @param name
     * @return
     */
    private byte[] loaderClassData(String name) {
        InputStream is = null;
        byte[] data = null;
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        this.name = this.name.replace(".", "/");
        try {
            is = new FileInputStream(new File(path + name + fileType));
            int c = 0;
            while (-1 != (c = is.read())) {
                baos.write(c);
            }
            data = baos.toByteArray();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                is.close();
                baos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return data;
    }

    public MyClassLoader(String name) {
        this.name = name;
    }

    public MyClassLoader(ClassLoader parent, String name) {
        super(parent);
        this.name = name;
    }

    private String path = "D:/";
    private final String fileType = ".class";
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    @Override
    public String toString() {
        return this.name;
    }
}
