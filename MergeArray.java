//Merge two arrays.

import java.util.Scanner;
public class MergeArray {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int n = input.nextInt();
            int[] array1 = new int[n];
            for (int i = 0; i < array1.length; i++) {
                array1[i] = input.nextInt();
            }
            int m = input.nextInt();
            int[] array2 = new int[m];
            for (int i = 0; i < array2.length; i++) {
                array2[i] = input.nextInt();
            }
            int[] mergedArray = new int[n + m];
            System.arraycopy(array1, 0, mergedArray, 0, array1.length);
            System.arraycopy(array2, 0, mergedArray, array1.length, array2.length);
            for (int i : mergedArray) {
                System.out.print(i + " ");
            }
        }
    }
}