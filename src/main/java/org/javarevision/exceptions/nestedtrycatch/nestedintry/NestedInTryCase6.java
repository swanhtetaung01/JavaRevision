package org.javarevision.exceptions.nestedtrycatch.nestedintry;

public class NestedInTryCase6 {
    public static void main(String[] args) {

        try {
            System.out.println("statement 1");
            try {
                System.out.println("statement 2");
            } catch (Exception e) {
                System.out.println("statement 3");
            }
        } catch (Exception e) {
            System.out.println("statement 4");
        } finally {
            System.out.println("statement 5");
        }
    }

}
