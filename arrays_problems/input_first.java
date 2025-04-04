package arrays_problems;

import java.util.Scanner;

public class input_first {
    static void printArr(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]+" ");
        }
        System.out.println();

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of arry");
        int n= sc.nextInt();
        int arr[]=new int[n];
        System.out.println("enter the"+n+"num of arr element");
        //storing the arr elemet
        for (int i = 0; i < arr.length; i++) {
            arr[i]= sc.nextInt();
        }
        printArr(arr);
        int[] arr2=arr;
        printArr(arr2);
    }
}
