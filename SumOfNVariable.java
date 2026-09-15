//Write a program to find and display the sum of the first n natural numbers.

import java.util.Scanner;

public class SumOfNVariable {
    public static void main(String[] args) {
        
        try(Scanner sc = new Scanner(System.in)) {
            
            int n = sc.nextInt();
            int sum = 0;

            for (int i=1; i<=n; i++) {
                sum= sum + i;
            }
            System.out.print("Sum of first n natural numbers= "+sum);
        }
    }
    
}