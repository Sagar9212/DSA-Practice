//Search for an element in an array using linear search.

import java.util.Scanner;
public class LinerarSearch {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int n = input.nextInt();
            int[] array = new int[n];
            for (int i = 0; i < array.length; i++) {
                array[i] = input.nextInt();
            }
            int target = input.nextInt();
            int index = -1;
            for (int i = 0; i < array.length; i++) {
                if (array[i] == target) {
                    index = i;
                    break;
                }
            }
            System.out.println(index);
        }
    }
}