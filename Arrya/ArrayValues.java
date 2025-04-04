package Arrya;

import java.util.Scanner;

public class ArrayValues {
    static int FindFirstInt(int[] arr){
        int repeat=0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i]==arr[j]){
                    return repeat=arr[i];
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Size of array: ");
        int n= sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter the "+n+ "num of element in array");
        for (int i = 0; i < n; i++) {
            arr[i]= sc.nextInt();
        }
        ArrayValues a1=new ArrayValues();
        System.out.println(FindFirstInt(arr));
    }
}
