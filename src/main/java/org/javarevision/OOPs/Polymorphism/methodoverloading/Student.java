package org.javarevision.OOPs.Polymorphism.methodoverloading;

public class Student {

    public Course currentCourse;

    public void addCourse(Course course) {
        this.currentCourse = course;
    }
    public void addCourse(String coursename, int coursecode) {
        Course course = new Course(coursename, coursecode);
        this.currentCourse = course;
    }

    public Course getCurrentCourse() {
        return this.currentCourse;
    }
    public void showCurrentCourse() {
        System.out.print("Selected course is " +currentCourse.getCoursename());
        System.out.println(" " + currentCourse.getCoursecode());
    }
}
