// //Write a program to print the following pattern:

// *

// *
// *
// *

// *
// *
// *
// *
// *

// *
// *
// *

// *

public class Pattern7 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            int count;
            if (i <= 3) {
                count = 2 * i - 1;
            } else {
                count = 2 * (5 - i) + 1;
            }
            for (int j = 1; j <= count; j++) {
                System.out.println("*");
            }
            if (i < 5) {
                System.out.println();
            }
        }
    }
}