package org.javarevision.OOPs.Polymorphism.methodoverloading;

public class Course {
    public String coursename;
    public int coursecode;

    public Course() {

    }
    public Course(String coursename, int coursecode) {
        this.coursename = coursename;
        this.coursecode = coursecode;
    }
    public String getCoursename(){
        return coursename;
    }
    public int getCoursecode(){
        return coursecode;
    }
}
