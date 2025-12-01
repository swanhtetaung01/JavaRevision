package org.javarevision.OOPs.Polymorphism.constructoroverloading;

public class Student {
    public String name;
    public int gradeLevel;

    public Student (String name){
        this.name = name;
        System.out.println("Student name is " + name);
    }
    public Student (String name, int grade){
        this.name = name;
        this.gradeLevel = grade;
        System.out.println("Student name is " + name + " and grade level is " + grade);
    }
}
