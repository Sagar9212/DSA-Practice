//Write a program to display the month name and number of days using switch-case for a given month number.

import java.util.Scanner;

public class SwitchCase2 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int number = sc.nextInt();

            switch (number) {
                case 1 -> System.out.print("January, 31 days");
                case 2 -> System.out.print("February, 28 days");
                case 3 -> System.out.print("March, 31 days");
                case 4 -> System.out.print("April, 30 days");
                case 5 -> System.out.print("May, 31 days");
                case 6 -> System.out.print("June, 30 days");
                case 7 -> System.out.print("July, 31 days");
                case 8 -> System.out.print("August, 31 days");
                case 9 -> System.out.print("September, 30 days");
                case 10 -> System.out.print("October, 31 days");
                case 11 -> System.out.print("November, 30 days");
                case 12 -> System.out.print("December, 31 days");
                default -> System.out.print("Invalid Input");
            }
        }
    }
}