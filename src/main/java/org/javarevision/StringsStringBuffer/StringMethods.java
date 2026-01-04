package org.javarevision.StringsStringBuffer;

import java.util.Arrays;

public class StringMethods {
    public static void main(String[] args) {
        // length()
        //          0123456789
        String s = "Hello, World!";
        System.out.println(s.length());

        // charAt()
        System.out.println(s.charAt(4));

        // substring()
        System.out.println(s.substring(7));
        System.out.println(s.substring(0, 5));

        // indexOf()
        System.out.println(s.indexOf('W'));
        System.out.println(s.indexOf("World"));
        System.out.println(s.indexOf('o', 5));

        // replace()
        System.out.println(s.replace('o','0'));

        // startsWith()
        System.out.println(s.startsWith("Hello"));

        // endsWith()
        System.out.println(s.endsWith("World!"));

        // toLowerCase()
        System.out.println(s.toLowerCase());

        // toUpperCase()
        String newString = s.toUpperCase();
        System.out.println(s.toUpperCase());
        System.out.println(s);

        // split()
        String[] words = s.split(" ");
        System.out.println(Arrays.toString(words));

    }
}
