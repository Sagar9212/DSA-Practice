//Find the maximum and minimum element in an array.

import java.util.Scanner;
public class MaxMinOfArray {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
        int n = input.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = input.nextInt();
        }
        int max = array[0];
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println("Maximum element in the array: " + max);
        System.out.println("Minimum element in the array: " + min);
        }
    }
}