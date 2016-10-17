package other;

import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.Valid;

/**
 * Created by yangch on 2016/9/27.
 */
public class Main {


    public static void main(String[] args) {
        Student student = new Student();
        student.setAge(10);
        System.out.println(student.getAge());
    }

    @Money(message = "money>0")
    public double getMoney(double money) {
        return money;
    }

    @Valid
    @NotEmpty(message = "bo.product_marketing.error_form_code_is_empty")
    public String getCode(String code) {
        if (code == null) {
            return "";
        }
        return code;
    }

//    @Test
//    public void demo01() {
//        String[] ids = new String[]{"yyy", "ccc"};
//        String[] ids2 = new String[]{};
//        //Inner inner = new Inner();
//        //inner.setIds(null);
//        //this.print("");
//        this.print2();
//    }

    @Valid
    @NotEmpty(message = "return null")
    private String print2() {
        return null;
    }

    private void print(@NotEmpty(message = "1fasdf") String id) {
        System.out.println(id);
    }

    class Inner {
        @NotEmpty(message = "为空了")
        private String[] ids;

        public String[] getIds() {
            return ids;
        }

        public void setIds(String[] ids) {
            this.ids = ids;
        }
    }
}
