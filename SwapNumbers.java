//Write a program to swap two numbers using a third variable.

import java.util.Scanner;

public class SwapNumbers {
    public static void main(String[] args) {

        try(Scanner sc = new Scanner(System.in)) {
            int num1 = sc.nextInt();
            int num2 = sc.nextInt();
            int num3;

            num3 = num1;
            num1 = num2;
            num2 = num3;

            System.out.print("Num1= "+ num1+ ", Num2= "+num2);
        }
    }    
}
