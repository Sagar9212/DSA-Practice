//Write a program to find the sum of the series: 2/3 + 4/7 + 6/11 + 8/15 + ... up to n terms.

import java.util.Scanner;
public class SeriesSum2 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner (System.in)) {
            int n = sc.nextInt();
            double sum = 0.0;
            for (int i=1; i <= n; i++) {
                sum += (double) (2 * i) / (4 * i - 1);
            }
            System.out.print("sum = " + sum);
        }
    }
}