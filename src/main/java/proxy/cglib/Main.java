package proxy.cglib;

/**
 * Created by yangch on 2016/9/30.
 */
public class Main {
    public static void main(String[] args) {
        Student student= StudentCglib.newInstance(Student.class);
        student.print("123");
    }
}
