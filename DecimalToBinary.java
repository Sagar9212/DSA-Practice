//Write a program to take a number as input and print its equivalent binary representation.

import java.util.Scanner;
public class DecimalToBinary {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int remainder = 0;
            int binary = 0;
            while (n>0) {
                int x = n%2;
                remainder = remainder*10 + x;
                n = n/2;
            }
            while (remainder != 0) {
                int y = remainder%10;
                binary = binary*10 + y;
                remainder = remainder/10;
            }
            System.out.print("Binary equivalent= " + binary);
        }
    }
}