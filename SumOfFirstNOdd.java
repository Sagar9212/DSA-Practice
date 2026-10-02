//Write a program to print the sum of the first n odd numbers.

import java.util.Scanner;
public class SumOfFirstNOdd {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int sum = 0;
            for (int i=1; i <= n; i++) {
                sum += (2 * i - 1);
            }
            System.out.print("Sum of first n odd numbers is= " + sum);
        }
    }
}