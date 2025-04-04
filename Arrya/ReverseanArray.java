package Arrya;

import java.util.Scanner;

public class ReverseanArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size if array");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("ehter the num of element");
        for (int i = 0; i < arr.length; i++) {
            arr[i]= sc.nextInt();
        }
        int temp=0;
        int start=0;
        int end= arr.length;
        for (int i = 0; i < arr.length; i++) {
            temp=start;
            start=end;
            end=temp;
            System.out.println(temp);
        }
        System.out.println("your reverse aray is :");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
