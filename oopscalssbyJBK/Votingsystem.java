package oopscalssbyJBK;

import java.util.Scanner;

public class Votingsystem {
    private String name;
    private int age;
    private String vote;

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter name:");
        String name= sc.nextLine();
        System.out.println("enter age");
        int age= sc.nextInt();
    }
}
