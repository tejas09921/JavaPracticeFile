package Recursion;

import java.util.Scanner;

public class Natural {
    static void PrintNatural(int n){
        //BAse case
        if (n == 1) {
            System.out.println(n);
            return;
        }
        // Self work
        System.out.println(n);
        // Recursive work
        PrintNatural(n-1);

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value if n");
        int n= sc.nextInt();
        PrintNatural(n);
    }
}
