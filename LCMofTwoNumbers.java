//Write a program to find the LCM of two numbers.

import java.util.Scanner;
public class LCMofTwoNumbers {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int i = Math.max(a, b);
            while (true) {
                if (i % a == 0 && i % b == 0) {
                    System.out.println("LCM = " + i);
                    break;
                }
                i++;
            }
        }
    }
}