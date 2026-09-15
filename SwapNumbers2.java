//Write a program to swap two numbers without using a third variable.

import java.util.Scanner;

public class SwapNumbers2 {
    public static void main(String[] args){

        try (Scanner sc = new Scanner(System.in)) {

        double num1 = sc.nextDouble();
        double num2 = sc.nextDouble();

        num1 = num1 + num2;
        num2 = num1 - num2;
        num1 = num1 - num2;

        System.out.print("num1= "+num1+", num2= "+num2);
        }
    }
}