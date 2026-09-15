//Write a program to calculate simple and compound interest for given principal, rate, and time.

import java.util.Scanner;

public class CalculateInterest {
    public static void main(String[] args) {
        
        try (Scanner sc = new Scanner(System.in)) {
            double principal = sc.nextDouble();
            double rate = sc.nextDouble();
            double time = sc.nextDouble();

            double SimpleInterest= (principal*rate*time)/100;
            double CompoundInterest = (principal * Math.pow(1 + rate / 100, time) - principal);

            System.out.print("Simple Interest= "+SimpleInterest+", Compound Interest= "+CompoundInterest);
        }
    }    
}