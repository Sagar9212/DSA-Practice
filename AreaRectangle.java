//Write a program to calculate the area and perimeter of a rectangle given its length and breadth.

import java.util.Scanner;

public class AreaRectangle {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)){

        double lenght = sc.nextDouble();
        double breath = sc.nextDouble();

        double area = lenght*breath;
        double perimeter = (lenght*2) + (breath*2);

        System.out.print("Area= "+ area +", Perimeter= "+ perimeter);
        }
    
    }
}