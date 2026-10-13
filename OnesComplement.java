//Write a program to find the 1’s complement of a binary number and print it.

import java.util.Scanner;
public class OnesComplement {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String binary = sc.next();
            StringBuilder result = new StringBuilder();
            for (int i = 0; i < binary.length(); i++) {
                switch (binary.charAt(i)) {
                    case '0' -> result.append('1');
                    case '1' -> result.append('0');
                    default -> {
                        System.out.println("Invalid binary number");
                        return;
                    }
                }
            }
            System.out.println("1's complement = " + result);
        }
    }
}