//Write a program to reverse a given number.

import java.util.Scanner;
public class ReverseNumber {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int reverse = 0;
            while (n != 0) {
                int digit = n % 10;
                reverse = reverse*10 + digit;
                n = n/10;
            }
            System.out.print(reverse);
        }
    }
}