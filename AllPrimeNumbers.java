//Write a program to print all the prime numbers from 1 to n.

import java.util.Scanner;
public class AllPrimeNumbers {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            for (int i = 1; i<=n; i++) {
            boolean isPrime = true;
            if (i < 2) {
                isPrime = false;
            } else {
                for (int j = 2; j < i; j++) {
                    if (i % j == 0) {
                        isPrime = false;
                        break;
                    }
                }
            }
            if (isPrime) {
            System.out.print(i+" ");
            }
        }
        }
    }
}