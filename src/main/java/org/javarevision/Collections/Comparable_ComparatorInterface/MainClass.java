package org.javarevision.Collections.Comparable_ComparatorInterface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class MainClass {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        arrayList.add(100);
        arrayList.add(10);
        arrayList.add(20);
        arrayList.add(5);
        arrayList.add(15);
        Collections.sort(arrayList);
        System.out.println(arrayList);

        Student student = new Student(200, "John", 100);
        Student student2 = new Student(101, "Daniel", 200);
        ArrayList<Student> studentArrayList = new ArrayList<>();
        studentArrayList.add(student);
        studentArrayList.add(student2);
        Collections.sort(studentArrayList);

        for (Student s : studentArrayList) {
            System.out.println(s.getRollNo() + " : " + s.getName());
        }

        System.out.println("Marks compartor demo");
        Collections.sort(studentArrayList, new MarksComparator());
        for (Student s : studentArrayList) {
            System.out.println(s.getRollNo() + " : " + s.getName());
        }
    }
}

class MarksComparator implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        Student s1 = (Student) o1;
        Student s2 = (Student) o2;
        if (s1.getMarks() > s2.getMarks()) return 1;
        else return -1;
    }
}
