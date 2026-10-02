//Write a program to calculate the factorial of a number.

import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int factorial = 1;
            for (int i=1; i<=n; i++) {
                factorial *= i;
            }
            System.out.print("factorial= " + factorial);
        }
    }
}