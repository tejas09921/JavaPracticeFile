package Recursion;

import java.util.Scanner;

public class simple {
    static void PrintReverse(int n){
        if (n==1){
            System.out.println(n);
            return;
        }
        PrintReverse(n-1);
        System.out.println(n);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value of n");
        int n= sc.nextInt();
        PrintReverse(n);
    }
}
