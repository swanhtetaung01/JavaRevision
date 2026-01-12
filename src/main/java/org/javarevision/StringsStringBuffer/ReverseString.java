package org.javarevision.StringsStringBuffer;

public class ReverseString {
    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer("Hello, World!");
        System.out.println(stringBuffer);
        stringBuffer.reverse();
        System.out.println(stringBuffer);
    }
}
