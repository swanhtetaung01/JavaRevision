package org.javarevision.arrays;

public class ArrayEx2 {
    public static int[] createAndInitializeArray() {
        // start writing your code here
        int array[] = new int[5];
        for(int i = 0; i < array.length; i++){
            if (i == 0){
                array[i] += 10;
            }else if (i > 0) {
                array[i] = array[i - 1] + 10;
            }
        }

        return array;
    }

    public static void main(String[] args) {
        int[] array = createAndInitializeArray();
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
    }
}
