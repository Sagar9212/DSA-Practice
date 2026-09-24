//Write a program to input a year and check whether it is a leap year or not using conditional statements.

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            int year = sc.nextInt();
            if (year % 400 == 0 || (year % 4 ==0 && year % 100 != 0)) {
                System.out.print("It is a Leap Year");
            } else {
                System.out.print("It is not a Leap Year");
            }
        }
    }
}