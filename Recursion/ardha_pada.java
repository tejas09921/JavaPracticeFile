package Recursion;

import java.util.Scanner;

public class ardha_pada {
    static void print_multiples(int n, int k){
        //base case
        if (n==1) return;

        //small or resursive work
        print_multiples(n,k-1);
        // self work
        System.out.println(n * k);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int k= sc.nextInt();
        print_multiples(n,k);
    }
}
