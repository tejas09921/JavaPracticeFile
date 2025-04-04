package arraysfolder.secondlec;

import java.util.Scanner;

public class inpua_rr {
    static void printarr(int [] arr){
        for (int i=0;i< arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the sizze of arry");
        int n= sc.nextInt();
        int[] arr=new int[n];
        System.out.println("enter the inputes sizw of element:");
        for (int i=0;i<arr.length;i++){
            arr[i]= sc.nextInt();
        }
        /*for (int i=0;i<n;i++) {
            System.out.println(arr[i] + " ");
        }
        */
        System.out.println("original array");
        printarr(arr);
        // arry 1 copid in arry 2
        System.out.println("copied arry 2 is");
        int[] arr_2=arr;
        for (int i=0;i<n;i++){
            System.out.println(arr_2[i]);
        }
    }
}
