//Find the sum of array elements.

import java.util.Scanner;
public class SumOfArrayElements {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int n = input.nextInt();
            int[] array = new int[n];
            System.out.println("Enter " + n + " integers:");
            for (int i = 0; i < array.length; i++) {
                array[i] = input.nextInt();
            }
            int sum = 0;
            for (int i = 0; i < array.length; i++) {
                sum += array[i];
            }
            System.out.println("Sum of array elements: " + sum);
        }
    }
}