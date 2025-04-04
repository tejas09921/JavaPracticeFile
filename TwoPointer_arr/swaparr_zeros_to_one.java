package TwoPointer_arr;

import java.util.Scanner;

public class swaparr_zeros_to_one {
    static void Printarr(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]+" ");
        }
        System.out.println( );
    }
    static void swap(int[] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    static void zerosANDone(int[] arr){
        int n= arr.length;
        int zeros=0;
        for (int i = 0; i < n; i++) {
            if(arr[i]==0){
                zeros++;
            }
        }
        for (int i = 0; i < n; i++) {
            if (i<zeros){
                arr[i]=0;
            }else {
                arr[i]=1;
            }
        }
    }
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of arrey");
        int n= sc.nextInt();
        System.out.println("enter the element of arry");
        int[] arr=new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]= sc.nextInt();
        }
        System.out.println("your arr is:");
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
       zerosANDone(arr);
        System.out.println("SORTED ARRAY");
    }
}
