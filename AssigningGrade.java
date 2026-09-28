//Write a program that accepts a percentage (0-100) and assigns a grade based on the following criteria: 
//90-100: Grade A 
//80-89: Grade B 
//70-79: Grade C 
//60-69: Grade D 
//below 60: Grade F.

import java.util.Scanner;

public class AssigningGrade {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
        int percentage = sc.nextInt();

        if (percentage >=0 && percentage < 60) {
            System.out.print("Grade F");
        } else if (percentage < 70) {
                System.out.print("Grade D");
            } else if (percentage < 80) {
                    System.out.print("Grade C");
                } else if (percentage < 90) {
                        System.out.print("Grade B");
                    } else {
                        System.out.print("Grade A");
                    }
        }
    }
}