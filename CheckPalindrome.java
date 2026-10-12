//Write a program to check if a number is a palindrome.

import java.util.Scanner;
public class CheckPalindrome {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int original = n;
            int reverse =0;
            while (n != 0) {
                int y = n%10;
                reverse = reverse*10 + y;
                n = n/10;
            }
            if (reverse == original) {
                System.out.print("It is a Palindrome");
            } else {
                System.out.print("It is not a Palindrome");
            }
        }
    }
}