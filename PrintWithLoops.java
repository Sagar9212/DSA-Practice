//Write a program to print numbers from 1 to n.

import java.util.Scanner;
public class PrintWithLoops {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            for (int i=1; i <= n; i++) {
                System.out.print(i);
            }
        }
    }
}