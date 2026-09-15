//Write a program to input time in seconds and convert it to hours:minutes:seconds format.

import java.util.Scanner;

public class TimeConversion{
    public static void main(String[] args) {

        try(Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter Time in Seconds: ");
            int totalseconds = sc.nextInt();

            int totalminutes = totalseconds/60;
            int hours = totalminutes/60;
            int seconds = totalseconds - (totalminutes*60);
            int minutes = totalminutes - (hours*60);

            System.out.print(hours+":"+minutes+":"+seconds);
        }
    }
}