//Write a program to calculate the area and circumference of a circle given its radius.

import java.util.Scanner;

public class AreaCircle {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)){
        
        double radius = sc.nextDouble();

        double area = Math.PI*radius*radius;
        double circumference = 2*Math.PI*radius;

        System.out.print("area= "+ area + ", circumference= "+ circumference);
        }
    }
}
