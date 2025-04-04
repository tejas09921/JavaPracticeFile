package sismple;

import java.util.Scanner;

public class enteringptint {
    public static void main(String[] args) {
        //in this program to print multiple of 10 are not print and stop
        Scanner sc=new Scanner(System.in);
        System.out.println("entert the num:");
        int n=100;
        for (int i = 0; i < n; i++) {
            int nums= sc.nextInt();
            if (nums%10==0){
                System.out.println("program exit");
            }
        }

    }
}
