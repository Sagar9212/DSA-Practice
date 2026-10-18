//Write a program to print the following pattern:
//*
//**
//***
//****
//*****

public class Pattern2 {
    public static void main(String[] args) {
        for (int i=1; i<=5; i++) {
            for (int a = 1; a <= i; a++) { 
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}