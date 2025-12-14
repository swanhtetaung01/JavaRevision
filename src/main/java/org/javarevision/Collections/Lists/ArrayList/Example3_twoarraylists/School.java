package org.javarevision.Collections.Lists.ArrayList.Example3_twoarraylists;

import java.util.ArrayList;

public class School {
    public static void main(String[] args) {
        ArrayList<Student> math_list = new ArrayList();
        ArrayList<Student> science_list = new ArrayList();

        Student s1 = new Student("Ravi", 1);
        Student s2 = new Student("Tom", 2);
        Student s3 = new Student("Ram", 3);
        Student s4 = new Student("Tanvi", 4);
        Student s5 = new Student("Vikas", 5);
        Student s6 = new Student("John", 6);
        Student s7 = new Student("Abhi", 7);
        Student s8 = new Student("Faisal", 8);

        math_list.add(s1);
        math_list.add(s2);
        math_list.add(s3);
        math_list.add(s4);
        math_list.add(s5);

        science_list.add(s6);
        science_list.add(s1);
        science_list.add(s7);
        science_list.add(s5);
        science_list.add(s8);

        for (Student x : math_list){
            for (Student y : science_list){
                if (x.getName().equals(y.getName())){
                    System.out.println(x.getName() + " takes both math and science.");
                }
            }
        }
    }
}
