//Write a program to check if a number is a perfect number.

import java.util.Scanner;
public class PerfectNumber {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int sum = 0;
            for (int i = 1; i < n; i++) {
                if (n%i == 0 ) {
                    sum += i;
                }
            }
            if (sum == n) {
                System.out.print("It is a perfect number");
            } else {
                System.out.print("It is not a perfect number");
            }
        }
    }
}