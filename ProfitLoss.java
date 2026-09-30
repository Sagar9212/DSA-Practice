//Write a program to find profit or loss percentage given cost price and selling price.

import java.util.Scanner;

public class ProfitLoss {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            double cost = sc.nextDouble();
            double sell = sc.nextDouble();
            if (cost < sell) {
                System.out.print("Profit: " + (((sell-cost)/cost)*100));
            } else if (cost > sell) {
                System.out.print("Loss: " + (((cost-sell)/cost)*100));
            } else {
                System.out.print("No Profit No Loss");
            }
        }
    }
}