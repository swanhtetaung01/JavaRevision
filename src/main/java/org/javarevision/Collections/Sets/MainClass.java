package org.javarevision.Collections.Sets;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class MainClass {
    public static void main(String[] args) {
        Set<String> s1 = new HashSet<String>();
        s1.addAll(Arrays.asList(new String[]{"John", "Michael", "Roy"}));
        Set<String> s2 = new HashSet<String>();
        s2.addAll(Arrays.asList(new String[]{"Lita", "Tina", "Roy"}));

        Set<String> s3 = new HashSet<>(s1);
        s3.addAll(s2);              //Union
        System.out.println("Union : " + s3);

        Set<String> s4 = new HashSet<>(s1);
        s4.retainAll(s2);           //Intersection
        System.out.println("Intersection : " + s4);
    }
}
