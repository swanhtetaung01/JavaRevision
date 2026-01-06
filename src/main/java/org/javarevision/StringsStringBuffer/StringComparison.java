package org.javarevision.StringsStringBuffer;

public class StringComparison {
    public static void main(String[] args) {
        String string1 = "Hello, World!";
        String string2 = "Hello, World!";
        String string3 = "HELLO, WORLD!";

        // using equals()
        System.out.println(string1.equals(string2));
        System.out.println(string1.equals(string3));

        System.out.println(string1.equalsIgnoreCase(string2));
        System.out.println(string1.equalsIgnoreCase(string3));

        // using compareTo()
        System.out.println(string1.compareTo(string2));
        System.out.println(string1.compareTo(string3));

        // using ==
        String str1 = new String("Hello");
        String str2 = new String("Hello");
        System.out.println(str1 == str2);
        System.out.println(str1.equals(str2));
    }
}
