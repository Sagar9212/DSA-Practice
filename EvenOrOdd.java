//Write a program to input an integer and check whether it is even or odd using if–else.

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int digit = sc.nextInt();

            if (digit%2==0) {
                System.out.print("it is even");
            } else {
                System.out.print("it is odd");
            }
        }
    }
}