package Recursion;

import java.util.Scanner;

public class reverceorder {
    static void PRint_rever(int n){
        if (n == 1) {
            System.out.println(n);
            return;
        }
        System.out.println(n);
        PRint_rever(n-1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        PRint_rever(n);
    }
}
