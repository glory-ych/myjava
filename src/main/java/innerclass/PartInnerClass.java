package innerclass;

/**
 * Created by yangch on 2016/10/9.
 */
public class PartInnerClass {
    public void print() {
        class Inner {
            private int age;
            private String name;

            public Inner(int age, String name) {
                this.age = age;
                this.name = name;
            }

            public Inner() {
            }

            private void print() {
                System.out.println("test");
            }
        }
        Inner inner = new Inner();
        inner.print();
    }
}
