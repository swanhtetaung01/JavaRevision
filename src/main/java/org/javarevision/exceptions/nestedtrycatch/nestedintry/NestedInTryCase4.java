package org.javarevision.exceptions.nestedtrycatch.nestedintry;

public class NestedInTryCase4 {
    public static void main(String[] args) {

        try {
            System.out.println(10/0);
            try {
                System.out.println("statement 2");
            } catch (Exception e) {
                System.out.println("statement 3");
            }
        } catch (Exception e) {
            System.out.println(10/0);
        } finally {
            System.out.println("statement 5");
        }
    }

}
