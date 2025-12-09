package org.javarevision.exceptions.trycatch;

public class ABC {
    public static void main(String[] args) {
        System.out.println("Hello");
        try {
            System.out.println(10 / 0);
        }
        catch (Exception e){
            System.out.println(10/2);
        }
        System.out.println("Hi");
    }
}

