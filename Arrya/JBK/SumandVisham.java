package Arrya.JBK;

import java.util.Scanner;

public class SumandVisham {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n= sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter the element of arrry");
        for (int i = 0; i < arr.length; i++) {
            arr[i]= sc.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]%2==0){
                System.out.println("the num sum" +arr[i]);
            }

        }
        for (int i = 0; i < arr.length; i++) {
           if (arr[i] %2 !=0){
                System.out.println("the num is visham"+arr[i]);
            }
        }
    }
}
