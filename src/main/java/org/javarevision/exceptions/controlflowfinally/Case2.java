package org.javarevision.exceptions.controlflowfinally;

public class Case2 {
    public static void main(String[] args) {

        /* This program terminates normally since there is an exception inside of try block.
        You will see finally block getting executed here */

        System.out.println("statement 1");
        try {
            System.out.println(10 / 0);
        } catch (ArithmeticException e) {
            System.out.println("statement 3");
        } finally {
            System.out.println("statement 4");
        }
        System.out.println("statement 5");
    }
}
