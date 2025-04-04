package Arrya.JBK;

import java.util.Scanner;

public class iteration {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n= sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter the element of arrry");
        for (int i = 0; i < arr.length; i++) {
            arr[i]= sc.nextInt();
        }
        int temp=arr[0];
        for (int i = 1; i < args.length; i++) {
            System.out.println(arr[i]);
        }
        System.out.print(temp);
    }
}
