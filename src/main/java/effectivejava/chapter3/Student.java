package effectivejava.chapter3;

/**
 * Created by yangch on 2016/10/15.
 */
public final class Student implements Cloneable {
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Student() {
    }

    public Student(int age) {
        this.age = age;
    }

    @Override
    protected Student clone() throws CloneNotSupportedException {
        return (Student) super.clone();
    }
}
