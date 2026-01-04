package org.javarevision.arrays;

public class AnonymousArrayExample {
    public static void main(String[] args) {
        /*int[] myArray = new int[]{1, 2, 3, 4, 5};
        System.out.println(sum(myArray));*/

        System.out.println(sum(new int[]{1, 2, 3, 4, 5}));
        System.out.println(sum(new int[]{1, 20, 3, 4, 5}));
        System.out.println(sum(new int[]{1, 2, 30, 4, 5}));
    }

    private static int sum(int[] numbers) {
        int total = 0;
        for (int num : numbers)
            total += num;
        return total;
    }
}
