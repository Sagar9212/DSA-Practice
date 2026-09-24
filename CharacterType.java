//Write a program to input a character and check whether it is an uppercase alphabet, lowercase alphabet, digit, or special character.

import java.util.Scanner;

public class CharacterType {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            char ch = sc.next().charAt(0);
            if (ch >= 'A' && ch <= 'Z') {
                System.out.print("It is a Uppercase Alphabet");
            } else {
                if (ch >= 'a' && ch <= 'z') {
                    System.out.print("It is a Lowercase Alphabet");
                } else{
                    if (ch >= '0' && ch <= '9') {
                        System.out.print("It is a digit");
                    } else {
                        System.out.print("It is a Special Character");
                    }
                }
            }
        }
    }
}