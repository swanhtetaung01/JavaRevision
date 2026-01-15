package org.javarevision.generics;

import java.util.ArrayList;
import java.util.List;

public class GenericsExample {
    public static void main(String[] args) {
        /*// Without Generics
        List numbers = new ArrayList();
        numbers.add(1);
        numbers.add(2);
        numbers.add("a string");

        for (Object number : numbers){
            Integer num = (Integer) number;
            System.out.println(num);
        }*/

        // With Generics
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        //numbers.add("a string");

        for (Integer number : numbers){
            Integer num = number;
            System.out.println(num);
        }
    }
}
