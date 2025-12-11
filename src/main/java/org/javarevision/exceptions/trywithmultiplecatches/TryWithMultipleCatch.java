package org.javarevision.exceptions.trywithmultiplecatches;

public class TryWithMultipleCatch {

        public static void main(String[] args) {
            try {
                System.out.println("Statement 1");
                System.out.println(10 / 0);
                System.out.println("Statement 3");
            } catch (ArithmeticException e) {
                System.out.println(e.getMessage());
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }

        }
}
