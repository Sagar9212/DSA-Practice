//Write a program to input three numbers and find the largest among them using if–else.

import java.util.Scanner;

public class LargestInThree {
    public static void main (String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int num1 = sc.nextInt();
            int num2 = sc.nextInt();
            int num3 = sc.nextInt();

            if (num3 >= num1 && num3 >= num2) {
                System.out.print("Num3 is the largest number");
            } else {
                if (num2 >= num1 && num2 >= num3) {
                    System.out.print("Num2 is the largest number");
                } else {
                    System.out.print("Num1 is the largest number");
                }
            }
        }
    }
}