package org.javarevision.multidimensionalArrays;

public class MultiDimensionalArrays {
    public static void main(String[] args) {
        /*// Declaration
        int[][] my2DArray;

        // Memory allocation
        my2DArray = new int[3][3];*/

        //int[][] my2DArray = new int[3][3];
        int[][] my2DArray = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        System.out.println("Before updating");
        System.out.println(my2DArray[0][0]);
        System.out.println(my2DArray[1][2]);

        my2DArray[0][0] = 5;
        my2DArray[1][2] = 15;

        System.out.println("After updating");
        System.out.println(my2DArray[0][0]);
        System.out.println(my2DArray[1][2]);
    }
}
