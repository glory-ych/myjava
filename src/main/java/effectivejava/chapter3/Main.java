package effectivejava.chapter3;

/**
 * Created by yangch on 2016/10/15.
 */
public class Main {
    public static void main(String[] args) {
        Student student=new Student();

        try {
            CloneDemo demo = new CloneDemo();
            demo.setName("demo");
            demo.setStudent(student);
            CloneDemo cloneDemo = demo.clone();
            System.out.println(demo.getStudent());
            System.out.println(cloneDemo.getStudent());
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
