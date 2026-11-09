// Read and print elements of a one-dimensional array.

import java.util.Scanner;
public class Array1D {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int n = input.nextInt();
            int[] array = new int[n];
            System.out.println("Enter " + n + " integers:");
            for (int i = 0; i < array.length; i++) {
                array[i] = input.nextInt();
            }
        System.out.println("You entered:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        }
    }
}