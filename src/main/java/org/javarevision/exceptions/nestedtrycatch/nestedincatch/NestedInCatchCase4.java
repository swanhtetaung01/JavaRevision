package org.javarevision.exceptions.nestedtrycatch.nestedincatch;

public class NestedInCatchCase4 {
    public static void main(String[] args) {

        try {
            System.out.println(10/0);
        } catch (Exception e) {
            System.out.println("statement 2");
            try {
                System.out.println(10/0);
            } catch (Exception ex) {
                System.out.println(10/0);
            }
        } finally {
            System.out.println("statement 5");
        }
    }

}
