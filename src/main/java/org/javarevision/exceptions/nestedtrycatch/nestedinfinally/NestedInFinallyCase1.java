package org.javarevision.exceptions.nestedtrycatch.nestedinfinally;

public class NestedInFinallyCase1 {
    public static void main(String[] args) {

        try {
            System.out.println("statement 1");
        } catch (Exception e) {
            System.out.println("statement 2");
        } finally {
            System.out.println("statement 3");
            try {
                System.out.println("statement 4");
            } catch (Exception ex) {
                System.out.println("statement 5");
            }
        }
    }

}
