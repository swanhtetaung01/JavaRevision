package org.javarevision.exceptions.nestedtrycatch.nestedinfinally;

public class NestedInFinallyCase3 {
    public static void main(String[] args) {

        try {
            System.out.println(10/0);
        } catch (Exception e) {
            System.out.println(10/0);
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
