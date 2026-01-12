package org.javarevision.StringsStringBuffer;

public class ToStringExample {
    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer("Hello, ");
        stringBuffer.append("World!");

        String string = stringBuffer.toString();
        System.out.println(string);
    }
}
