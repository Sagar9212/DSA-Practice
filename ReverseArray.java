//Reverse an array without taking extra space.

import java.util.Scanner;
public class ReverseArray {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int n = input.nextInt();
            int[] array = new int[n];
            for (int i = 0; i < array.length; i++) {
                array[i] = input.nextInt();
            }
            for (int i = 0; i < array.length / 2; i++) {
                int temp = array[i];
                array[i] = array[array.length - 1 - i];
                array[array.length - 1 - i] = temp;
            }
            for (int i : array) {
                System.out.print(i + " ");
            }
        }
    }
}