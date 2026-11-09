//Count even and odd numbers in an array.

import java.util.Scanner;
public class EvenOrOddInArray {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int n = input.nextInt();
            int[] array = new int[n];
            for (int i = 0; i < array.length; i++) {
                array[i] = input.nextInt();
            }
            int evenCount = 0;
            int oddCount = 0;
            for (int i = 0; i < array.length; i++) {
                if (array[i] % 2 == 0) {
                    evenCount++;
                } else {
                    oddCount++;
                }
            }
            System.out.println("Number of even elements in the array: " + evenCount);
            System.out.println("Number of odd elements in the array: " + oddCount);
        }
    }
}