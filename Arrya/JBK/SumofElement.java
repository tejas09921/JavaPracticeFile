package Arrya.JBK;

import java.util.Scanner;

public class SumofElement {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n= sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter the element of arrry");
        for (int i = 0; i < arr.length; i++) {
            arr[i]= sc.nextInt();
        }
        int sum=0;
        System.out.println("The sum of these element is :");
        for (int i = 0; i < arr.length; i++) {
            sum=arr[i]+sum;
        }
        System.out.println(sum);
    }
}
