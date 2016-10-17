package effectivejava.chapter3;

/**
 * Created by yangch on 2016/10/15.
 */
public class CloneDemo implements Cloneable {

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    private Student student;

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    protected CloneDemo clone() throws CloneNotSupportedException {
        CloneDemo clone = (CloneDemo) super.clone();
        clone.student = student.clone();
        return clone;
    }
}
