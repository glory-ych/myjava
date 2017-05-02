package com.glory.service.study.other.test1;

/**
 * Created by yangch on 2017/4/11 0011.
 */
public class A {
    public String show(D obj) {
        return ("A and D");
    }

    public String show(A obj) {
        return ("A and A");
    }

    //this.show(O)、super.show(O)、this.show((super)O)、super.show((super)O)
    public static void main(String[] args) {
        A a1 = new A();
        A a2 = new B();
        B b = new B();
        C c = new C();
        D d = new D();

        System.out.println("1--" + a1.show(b));
        System.out.println("2--" + a1.show(c));
        System.out.println("3--" + a1.show(d));
        System.out.println("4--" + a2.show(b));//this=A,O=B
        System.out.println("5--" + a2.show(c));//this=A,O=C
        System.out.println("6--" + a2.show(d));
        System.out.println("7--" + b.show(b));
        System.out.println("8--" + b.show(c));
        System.out.println("9--" + b.show(d));
    }
}

class B extends A {
    public String show(B obj) {
        return ("B and B");
    }

    public String show(A obj) {
        return ("B and A");
    }
}

class C extends B {

}

class D extends B {

}
