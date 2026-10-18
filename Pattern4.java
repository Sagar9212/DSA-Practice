//Write a program to print the following pattern:
//5
//45
//345
//2345
//12345

public class Pattern4 {
    public static void main(String[] args) {
        for (int i=5; i>=1; i--) {
            for (int a = i; a <= 5; a++) {
                System.out.print(a);
            }
            System.out.println("");
        }
    }
}