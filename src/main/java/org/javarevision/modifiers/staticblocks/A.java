package org.javarevision.modifiers.staticblocks;

class C {
    static int x;

    public C() {
        System.out.println("Inside constructor of C");
    }

    static {
        x = 10;
        System.out.println("Inside static block");
    }


}
// static block will be executed before the constructor is build or executed
public class A {
    public static void main(String[] args) {
        C c = new C();
    }
}
