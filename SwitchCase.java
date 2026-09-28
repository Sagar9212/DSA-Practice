//Write a program to display the day of the week based on a number (1–7) using switch-case.

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int day = sc.nextInt();
            
            switch (day) {
                case 1 -> System.out.print("Monday");
                case 2 -> System.out.print("Tuesday");
                case 3 -> System.out.print("Wednesday");
                case 4 -> System.out.print("Thursday");
                case 5 -> System.out.print("Friday");
                case 6 -> System.out.print("Saturday");
                case 7 -> System.out.print("Sunday");
                default -> System.out.print("Invalid Input");
            }
        }
    }
}