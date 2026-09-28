//Write a program to classify a triangle as Equilateral, Isosceles, or Scalene based on its side lengths.

import java.util.Scanner;

public class ClassifyTriangle {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            double side1 = sc.nextDouble();
            double side2 = sc.nextDouble();
            double side3 = sc.nextDouble();

            if (side1 == side2 && side2 == side3){
                System.out.print("It is an Equilateral Triangle");
            } else if (side1 == side2 || side2 == side3 || side3 == side1) {
                System.out.print("It is an Isosceles Triangle");
            } else {
                System.out.print("It is a Scalene Triangle");
            }
        }
    }
}