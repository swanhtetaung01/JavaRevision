package org.javarevision.Collections.Sets.TreeSet;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class MainClass {
    public static void main(String[] args) {
        /*
        * Assume that there are admissions happening in a school for 10th grade and
        * we are asked to store a list of students and produce them in sorted order of their names.
        *
        * */

        List<String> studentList = new ArrayList<>();
        studentList.add("John");
        studentList.add("Oliver");
        studentList.add("William");
        studentList.add("Noah");
        studentList.add("Alice");

        TreeSet<String> sortedStudents = new TreeSet<String>();
        for(String s : studentList){
            sortedStudents.add(s);
        }
        System.out.println(sortedStudents);
    }
}
