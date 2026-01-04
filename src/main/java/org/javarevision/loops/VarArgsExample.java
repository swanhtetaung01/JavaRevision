package org.javarevision.loops;

public class VarArgsExample {
    /*public static int sum(int... numbers) {
        int total = 0;
        for (int num : numbers) {
            total += num;
        }
        return total;
    }*/

    public static void sum(String prefix, int... numbers) {
        int total = 0;
        for (int num : numbers) {
            total += num;
        }
        System.out.println(prefix + total);
    }

    public static void main(String[] args) {
        sum("Numbers: ",3, 5);
        sum("Hello: ",3, 5, 6, 7, 8);
        sum("N: ");
    }
}
