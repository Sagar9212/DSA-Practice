//Write a program to check if a number is a strong number.

import java.util.Scanner;
public class StrongNumber {
    public static void main(String[] args) {
        try (Scanner sc =  new Scanner(System.in)) {
            int n = sc.nextInt();
            int temp = n;
            int sum = 0;
            while (n > 0) {
                int a = n % 10;
                int factorial = 1;
                for (int i = 1; i <= a; i++) {
                    factorial *= i;
                }
                sum += factorial;
                n = n/10;
            }
            if (temp == sum) {
                System.out.print("It is a Strong Number");
            } else {
                System.out.print("It is not a Strong Number");
            }
        }
    }
}