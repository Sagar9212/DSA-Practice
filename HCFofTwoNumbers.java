//Write a program to find the HCF (GCD) of two numbers.

import java.util.Scanner;
public class HCFofTwoNumbers {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int hcf = 1;
            int c = Math.min(a,b);
            for (int i = 1; i <= c; i++) {
                if (a%i == 0 && b%i == 0) {
                    hcf = i;
                }
            }
        System.out.print("HCF = " + hcf);
        }
    }
}