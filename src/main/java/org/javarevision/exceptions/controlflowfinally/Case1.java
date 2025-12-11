package org.javarevision.exceptions.controlflowfinally;

public class Case1 {
    public static void main(String[] args) {

        /* This program terminates abnormally since there is an exception outside of try block */

        System.out.println(10/0);
        try {
            System.out.println("statement 2");
        } catch (ArithmeticException e) {
            System.out.println("statement 3");
        } finally {
            System.out.println("statement 4");
        }
        System.out.println("statement 5");
    }
}
