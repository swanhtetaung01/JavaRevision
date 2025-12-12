package org.javarevision.exceptions.nestedtrycatch.nestedincatch;

public class NestedInCatchCase2 {
    public static void main(String[] args) {

        try {
            System.out.println(10/0);
        } catch (Exception e) {
            System.out.println(10/0);
            try {
                System.out.println("statement 3");
            } catch (Exception ex) {
                System.out.println("statement 4");
            }
        } finally {
            System.out.println("statement 5");
        }
    }

}
