package org.javarevision.exceptions.methodstoprintexceptions;

public class MethodToPrintException {

    public static void main(String[] args) {
        try {
            System.out.println("Statement 1");
            System.out.println(10 / 0);
            System.out.println("Statement 3");
        } catch (ArithmeticException e) {
            e.printStackTrace(); //1

            /*
            System.out.println(e.toString());  //2

            /*
            System.out.println(e.getMessage());  //3
            */
        }
        System.out.println("Statement 5");
    }
}
