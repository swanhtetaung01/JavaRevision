package org.javarevision.StringsStringBuffer;

public class StringConcatenation {
    public static void main(String[] args) {
        String string1 = "Hello, ";
        String string2 = "World!";

        // Using +
        String greeting = string1 + string2;
        System.out.println(greeting);

        // concat()
        String greetingNew = string1.concat(string2);
        System.out.println(greetingNew);

        // Differences
        System.out.println("Hello " + 5);
        //System.out.println("Hello ".concat(5));
        System.out.println(10 + 5);
        System.out.println(10 + "5");

        // Activity
        String s1 = "Hello, ";
        String s2 = "World! ";
        int year = 2024;

        // + operator
        String sentence1 = s1 + s2 + year;
        System.out.println(sentence1);

        // using concat()
        String sentence2 = string1.concat(string2).concat(String.valueOf(year));
        System.out.println(sentence2);
    }
}
