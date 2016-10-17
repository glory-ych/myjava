package other;

import javax.validation.constraints.NotNull;

/**
 * Created by yangch on 2016/9/27.
 */
public class Student {
    @NotNull(message = "名称不能为空")
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
