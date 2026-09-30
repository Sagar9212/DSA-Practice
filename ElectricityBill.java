//Write a program to calculate electricity bill based on units consumed with these rates: 
//First 100 units at ₹5/unit 
//Next 100 units at ₹7/unit 
//Next 100 units at ₹10/unit 
//Above at ₹12/unit

import java.util.Scanner;
public class ElectricityBill {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int units = sc.nextInt();
            if (units < 0) {
                System.out.print("Invalid Input");
            } else if (units < 101) {
                System.out.print("Bill: ₹" + (units*5));
            } else if (units < 201) {
                System.out.print("Bill: ₹" + (500 + ((units-100)*7)));
            } else if (units < 301) {
                System.out.print("Bill: ₹" + (1200 + ((units-200)*10)));
            } else {
                System.out.print("Bill: ₹" + (2200 + ((units-300)*12)));
            }
        }
    }
}