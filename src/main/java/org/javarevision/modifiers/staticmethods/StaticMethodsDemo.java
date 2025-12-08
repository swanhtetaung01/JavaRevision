package org.javarevision.modifiers.staticmethods;

public class StaticMethodsDemo {
    public static void printMessage() {
        System.out.println("Inside static method ");
    }

    public void printNormalMessage() {
        System.out.println("Inside normal method");
    }
}

class MainClass {
    public static void main(String[] args) {
        StaticMethodsDemo.printMessage();
        A.printMessage();
    }
}