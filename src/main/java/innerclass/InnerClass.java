package innerclass;

/**
 * Created by yangch on 2016/10/8.
 */
public class InnerClass {
    public static void main(String[] args) {
        InnerClass innerClass = new InnerClass();
        InnerClass.Inner inner = innerClass.new Inner();
        //inner.print();
        inner.instance();

        InnerClass.StaticInner staticInner = new InnerClass.StaticInner();
    }

    private int age = 10;
    private static String name = "ych";

    public static void part(final String pname){
        final String address="";
        class PartClass{
            public void print(){
                System.out.println(pname+","+address);
                System.out.println(name);
            }
        }
    }

    public void out() {
        System.out.println("out");
    }

    public class Inner {
        private int iage = 20;
        private void print() {
            System.out.println("[外部age...]" + age);
            System.out.println("[内部age...]" + this.iage);
        }

        private void instance() {
            new Inner().print();
            //System.out.println(new Inner());
        }
    }

    public static class StaticInner {
        public void print() {
            System.out.println(name);
        }
    }
}
