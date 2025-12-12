package org.javarevision.exceptions.nestedtrycatch.nestedintry;

public class NestedInTryCase1 {
    public static void main(String[] args) {

        try {
            System.out.println(10/0);
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
