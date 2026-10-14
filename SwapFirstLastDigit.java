//Write a program to swap the first and last digit of a number.

import java.util.Scanner;
public class SwapFirstLastDigit {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int lastDigit = n % 10;
            int temp = n;
            int divisor = 1;
            while (temp >= 10) {
                temp /= 10;
                divisor *= 10;
            }
            int firstDigit = temp;
            int middle = (n % divisor) / 10;
            int result = lastDigit * divisor + middle * 10 + firstDigit;
            System.out.println("Result = " + result);
        }
    }
}