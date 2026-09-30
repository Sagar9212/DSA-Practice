//Write a program to calculate library fine based on late days as follows: 
//First 5 days late: ₹2/day 
//Next 5 days late: ₹4/day 
//Next 20 days days late: ₹6/day 
//More than 30 days: Membership Cancelled

import java.util.Scanner;
public class LibraryFine {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int days = sc.nextInt();
            if (days < 0) {
                System.out.print("Invalid Input");
            } else if (days < 6) {
                System.out.print("Fine: ₹" + (days * 2));
            } else if (days < 11) {
                System.out.print("Fine: ₹" + (10 + ((days-5)*4)));
            } else if (days < 31) {
                System.out.print("Fine: ₹" + (30 +((days-10)*6)));
            } else {
                System.out.print("Membership Cancelled");
            }
        }
    }
}