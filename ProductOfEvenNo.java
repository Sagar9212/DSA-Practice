//Write a program to print the product of even numbers from 1 to n.

import java.util.Scanner;
public class ProductOfEvenNo {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int product = 1;
            for (int i=1; i<=n; i++) {
                if (i % 2 == 0) {
                    product *= i;
                }
            }
            System.out.print("product of even numbers is= " + product);
        }
    }
}