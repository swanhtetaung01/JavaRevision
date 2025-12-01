package org.javarevision.OOPs.Polymorphism.methodoverloading;

public class Test {
    public static void main(String[] args) {

        Student student = new Student();
        student.addCourse("Maths", 401);
        student.getCurrentCourse();
        student.showCurrentCourse();
    }
}
