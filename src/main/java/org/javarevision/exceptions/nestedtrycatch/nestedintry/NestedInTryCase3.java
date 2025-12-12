package org.javarevision.exceptions.nestedtrycatch.nestedintry;

public class NestedInTryCase3 {
    public static void main(String[] args) {

        try {
            System.out.println("statement 1");
            try {
                System.out.println(10/0);
            } catch (Exception e) {
                System.out.println(10/0);
            }
        } catch (Exception e) {
            System.out.println("statement 4");
        } finally {
            System.out.println("statement 5");
        }
    }

}
