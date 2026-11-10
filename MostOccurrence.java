//Find the digit that occurs the most times in an integer number.

import java.util.Scanner;
public class MostOccurrence {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int number = input.nextInt();
            int[] count = new int[10];
            while (number > 0) {
                int digit = number % 10;
                count[digit]++;
                number /= 10;
            }
            int maxCount = 0;
            int mostFrequentDigit = -1;
            for (int i = 0; i < count.length; i++) {
                if (count[i] > maxCount) {
                    maxCount = count[i];
                    mostFrequentDigit = i;
                }
            }
            System.out.println(mostFrequentDigit);
        }
    }
}