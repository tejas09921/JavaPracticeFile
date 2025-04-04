package Recursion;

import java.util.Scanner;

public class print_n {
    static void printa_natu(int n){
        if (n==0){
            System.out.println(n);
            return;
        }
        printa_natu(n-1);
        System.out.println(n);
    }
    public static void main(String[] args) {
        System.out.println("print the num");
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        printa_natu(n);
    }
}
