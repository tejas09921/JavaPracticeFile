package Arrya;

import java.util.Scanner;

public class Numcountinarr {
    static void Printarr(int [] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]+ " ");
        }
        System.out.println();
    }
    static void Numcount(int [] arr,int num){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==num){
                num++;
            }
        }
        System.out.println("these num is repeit"+num+"times");
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size if array");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("ehter the num of element");
        for (int i = 0; i < arr.length; i++) {
            arr[i]= sc.nextInt();
        }
        System.out.println("Print these array");
        Printarr(arr);
        int num=5;
        Numcount(arr,num);
    }
}
