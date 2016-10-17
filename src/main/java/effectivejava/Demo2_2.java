package effectivejava;

/**
 * Created by yangch on 2016/10/8.
 */
public class Demo2_2 {
    public static void main(String[] args) {
        Demo2_2 demo2_2 = new Demo2_2.Inner().setage(10).name("ych").build();
        System.out.println(demo2_2.name);
    }

    private int age;
    private String name;

    public Demo2_2(Inner inner) {
        this.age = inner.age;
        this.name = inner.name;
    }
    //public Demo2_2(){}

    public static class Inner {
        private int age;
        private String name;

        public Inner() {
        }

        public Inner setage(int age) {
            this.age = age;
            return this;
        }

        public Inner name(String name) {
            this.name = name;
            return this;
        }

        public Demo2_2 build() {
            return new Demo2_2(this);
        }
    }
}
