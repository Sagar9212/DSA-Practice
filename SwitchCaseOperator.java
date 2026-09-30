//Write a program to implement a basic calculator using switch-case for +, -, *, /, %.

import java.util.Scanner;
public class SwitchCaseOperator {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            double num1 = sc.nextDouble();
            double num2 = sc.nextDouble();
            char operator = sc.next().charAt(0);
            switch (operator) {
                case '+' -> System.out.print(num1+num2);
                case '-' -> System.out.print(num1-num2);
                case '*' -> System.out.print(num1*num2);
                case '/' -> System.out.print(num1/num2);
                case '%' -> System.out.print(num1%num2);
                default -> System.out.print("Invalid Input");
            }
        }
    }
}