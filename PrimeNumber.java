//Write a program to check if a number is prime.

import java.util.Scanner;
public class PrimeNumber {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            boolean isPrime = true;
            if (n < 2) {
                isPrime = false;
            } else {
                for (int i = 2; i < n; i++) {
                    if (n % i == 0) {
                        isPrime = false;
                        break;
                    }
                }
            }
            if (isPrime) {
                System.out.print("It is a Prime Number");
            } else {
                System.out.print("It is not a Prime Number");
            }
        }
    }
}