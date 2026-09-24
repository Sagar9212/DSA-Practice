//Write a program to input a character and check whether it is a vowel or consonant using if–else.

import java.util.Scanner;

public class VowelOrConsonant {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            char ch = sc.next().charAt(0);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                System.out.print("It is a Vowel");
            } else {
                System.out.print("It is a Consonant");
            }
        }
    }
}