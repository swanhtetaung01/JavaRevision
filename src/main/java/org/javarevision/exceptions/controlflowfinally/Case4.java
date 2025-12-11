package org.javarevision.exceptions.controlflowfinally;

public class Case4 {
    public static void main(String[] args) {

        /* This program terminates abnormally since there is an exception in finally.
        */

        System.out.println("statement 1");
        try {
            System.out.println("statement 2");
        } catch (ArithmeticException e) {
            System.out.println("statement 3");
        } finally {
            System.out.println(10/0);
        }
        System.out.println("statement 5");
    }
}
