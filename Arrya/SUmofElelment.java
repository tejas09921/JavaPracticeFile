package Arrya;

import java.util.Scanner;

public class SUmofElelment {
    void sum(int[] arr, int n){
        int sum=0;
        for (int i = 0; i < n; i++) {
            sum=sum+arr[i];
        }
        System.out.println(sum);
    };
    void FindMax(int [] arr){
        int max=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>max){
                max=arr[i];
            }

        }
        System.out.println("Max Element is: "+max);
    }
    void SearchElelmetOnArray(int[]arr,int x){
        int index=-1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==x){
               index=i;
            }
        }
        System.out.println("Found the "+x+" in these index "+index);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of array");
        int n= sc.nextInt();
        int[] arr=new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]= sc.nextInt();
        }
        SUmofElelment s1=new SUmofElelment();
        s1.sum(arr,n);
        s1.FindMax(arr);
        s1.SearchElelmetOnArray(arr,5);
    }
}
