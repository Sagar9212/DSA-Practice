//Write a program to print the following pattern:
//1
//12
//123
//1234
//12345

public class Pattern3 {
    public static void main(String[] args) {
        for (int i=1; i<=5; i++) {
            for (int a = 1; a <= i; a++) {
                System.out.print(a);
            }
            System.out.println("");
        }
    }
}