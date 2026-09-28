// Write a program to find the roots of a quadratic equation and categorize them.

import java.util.Scanner;

public class QuadraticRoots {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            double a = sc.nextDouble();
            double b = sc.nextDouble();
            double c = sc.nextDouble();

            if (a == 0) {
                System.out.print("It is not a quadratic equation");
            } else {
                double discriminant = b * b - 4 * a * c;
                if (discriminant > 0) {
                    double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
                    double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);

                    System.out.println("Roots are real and distinct");
                    System.out.println("Root 1 = " + root1);
                    System.out.println("Root 2 = " + root2);
                } else {
                    if (discriminant == 0) {
                        double root = -b / (2 * a);
                        System.out.println("Roots are real and equal");
                        System.out.println("Root 1 = Root 2 = " + root);
                    } else {
                        System.out.println("Roots are complex");
                    }
                }
            }
        }
    }
}