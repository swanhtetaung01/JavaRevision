package org.javarevision.multidimensionalArrays;

public class ThirdDimension {
    public static void main(String[] args) {
        int[][][] cube = new int[3][3][3];

        int value = 0;
        for (int depth = 0; depth < cube.length; depth++) {
            for (int row = 0; row < cube[depth].length; row++) {
                for (int col = 0; col < cube[depth][row].length; col++) {
                    cube[depth][row][col] = value++;
                    System.out.print(cube[depth][row][col] + " ");
                }
                System.out.println();
            }
        }
    }
}
