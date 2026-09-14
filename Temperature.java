//Write a program to convert temperature from Celsius to Fahrenheit.

import java.util.Scanner;

public class Temperature {
    public static void main(String[]args) {
        
        try (Scanner sc = new Scanner(System.in)) {
            
            double celsius = sc.nextDouble();

            double fahrenheit = (celsius*9/5) + 32;

            System.out.print("Fahrenheit= "+ fahrenheit);
        }
    }
}
