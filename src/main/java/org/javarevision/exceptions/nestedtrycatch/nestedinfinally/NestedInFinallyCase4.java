package org.javarevision.exceptions.nestedtrycatch.nestedinfinally;

public class NestedInFinallyCase4 {
    public static void main(String[] args) {

        try {
            System.out.println("statement 1");
        } catch (Exception e) {
            System.out.println("statement 2");
        } finally {
            System.out.println(10/0);
            try {
                System.out.println("statement 4");
            } catch (Exception ex) {
                System.out.println("statement 5");
            }
        }
    }

}
