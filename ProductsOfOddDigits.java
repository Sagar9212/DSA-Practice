//Write a program to find the product of odd digits of a number.

import java.util.Scanner;
public class ProductsOfOddDigits {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int product = 1;
            boolean foundOdd = false;
            while (n != 0) {
                int a = n % 10;
                if (a % 2 != 0) {
                    product *= a;
                    foundOdd = true;
                }
                n = n / 10;
            }
            if (foundOdd) {
                System.out.print("Product of odd digits of a number = " + product);
            } else {
                System.out.print("No odd digits found");
            }
        }
    }
}