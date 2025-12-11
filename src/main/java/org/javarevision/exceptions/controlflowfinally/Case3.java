package org.javarevision.exceptions.controlflowfinally;

public class Case3 {
    public static void main(String[] args) {

        /* This program terminates normally since there is an exception of Arithmetic type and we are handling NullPointer.
        */

        System.out.println("statement 1");
        try {
            System.out.println(10 / 0);
        } catch (NullPointerException e) {
            System.out.println("statement 3");
        } finally {
            System.out.println("statement 4");
        }
        System.out.println("statement 5");
    }
}
