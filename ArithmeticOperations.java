// Q2: Write a program to input two numbers and display their sum, difference, product, and quotient.
// Division by zero should be handled carefully.

import java.util.Scanner;

public class ArithmeticOperations {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        double num1 = sc.nextDouble();
        double num2 = sc.nextDouble();

        double sum = num1 + num2;
        double difference = num1 - num2;
        double product = num1 * num2;

        System.out.print("Sum=" + sum + ", Diff=" + difference + ", Product=" + product + ", ");

        if (num2 != 0) {
            double quotient = num1 / num2;
            System.out.println("Quotient=" + quotient);
        } else {
            System.out.println("Quotient=Cannot divide by zero");
        }
        sc.close();
    }
}