//Write a program to input an integer and check whether it is positive, negative or zero using nested if–else.

import java.util.Scanner;

public class PosOrNegOrZero {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int digit = sc.nextInt();
            
            if (digit<0) {
                System.out.print("It is Negative");
            } else {
                if (digit>0) {
                    System.out.print("It is Positive");
                } else {
                    System.out.print("It is Zero");
                }
            }
        }
    }
}