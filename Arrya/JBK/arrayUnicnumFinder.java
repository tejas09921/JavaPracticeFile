package Arrya.JBK;

import java.util.Scanner;

public class arrayUnicnumFinder {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n= sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter the element of arrry");
        for (int i = 0; i < arr.length; i++) {
            arr[i]= sc.nextInt();
        }
        System.out.println("Enter the unic num to find this array");
        int num= sc.nextInt();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==num){
                System.out.println("unic num is find the array in this location ; "+i);
            }
        }
    }
}
