//Write a program to find the sum of digits of a number.

import java.util.Scanner;
public class SumOfDigitsOfNumber {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int sum = 0;
            while (n != 0) {
                int a = n % 10;
                sum += a;
                n = n/10;
            }
            System.out.print("Sum of Digits of a Number = " + sum);
        }
    }
}