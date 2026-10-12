//Write a program to check if a number is an Armstrong number.

import java.util.Scanner;
public class Armstrong {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int original = n;
            int temp = n;
            int sum = 0;
            int z = 0;
            if (n == 0) {
                z = 1;
            }
            while (n!=0) {
                z++;
                n = n/10;
            }
            while (temp!=0) {
                int y = temp%10;
                sum += (int) Math.pow(y,z);
                temp = temp/10;
            }
            if (sum == original) {
                System.out.print("It is an Armstrong number");
            } else {
                System.out.print("It is not a Armstrong number");
            }
        }
    }
}