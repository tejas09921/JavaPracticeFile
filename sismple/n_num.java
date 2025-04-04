package sismple;

import java.util.Scanner;

public class n_num {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the num to print");
        int num= sc.nextInt();
        for (int i = 0;i<=num; i--) {
            System.out.println(i);
        }
    }
}
