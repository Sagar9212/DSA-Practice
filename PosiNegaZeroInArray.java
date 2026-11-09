//Count positive, negative, and zero elements in an array.

import java.util.Scanner;
public class PosiNegaZeroInArray {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int n = input.nextInt();
            int[] array = new int[n];
            for (int i = 0; i < array.length; i++) {
                array[i] = input.nextInt();
            }
            int positiveCount = 0;
            int negativeCount = 0;
            int zeroCount = 0;
            for (int i = 0; i < array.length; i++) {
                if (array[i] > 0) {
                    positiveCount++;
                } else if (array[i] < 0) {
                    negativeCount++;
                } else {
                    zeroCount++;
                }
            }
            System.out.println("Number of positive elements in the array: " + positiveCount);
            System.out.println("Number of negative elements in the array: " + negativeCount);
            System.out.println("Number of zero elements in the array: " + zeroCount);
        }
    }
}