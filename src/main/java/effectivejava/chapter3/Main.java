package effectivejava.chapter3;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * Created by yangch on 2016/10/15.
 */
public class Main {
    public static void main(String[] args) {
        Student student=new Student();
        try {
            CopyOnWriteArrayList list=new CopyOnWriteArrayList();
            List list2=new ArrayList();
            CloneDemo demo = new CloneDemo();
            demo.setName("demo");
            demo.setStudent(student);
            CloneDemo cloneDemo = demo.clone();
            CloneDemo cloneDemo2 = CloneUtils.clone(demo);
            System.out.println(demo.getStudent());
            System.out.println(cloneDemo.getStudent());
            System.out.println(cloneDemo2.getStudent());
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
