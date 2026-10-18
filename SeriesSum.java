//Write a program to find the sum of the series: 1 + 3/4 + 5/6 + 7/8 + … up to n terms.

import java.util.Scanner;
public class SeriesSum {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner (System.in)) {
            int n = sc.nextInt();
            double sum = 1.0;
            for (int i=2; i <= n; i++) {
                sum += (double) (2 * i - 1) / (2 * i);
            }
            System.out.print("sum = " + sum);
        }
    }
}