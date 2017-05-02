package com.glory.service.study.other;

/**
 * Created by yangch on 2017/2/22 0022.
 */
public class StudentDto extends Student {
    private String code;

    public Student create() {
        Student student = new Student();
        student.setName(this.getName());
        student.setAge(this.getAge());
        return student;
    }

    public StudentDto() {
    }

    public StudentDto(String code) {
        this.setCode(code);
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return this.getName() + "_" + this.getAge() + "_" + this.getCode();
    }
}
