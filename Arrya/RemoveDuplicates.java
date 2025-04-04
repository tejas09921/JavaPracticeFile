package Arrya;

import java.util.Scanner;

public class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Size of array: ");
        int n= sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter the "+n+ "num of element in array");
        for (int i = 0; i < n; i++) {
            arr[i]= sc.nextInt();
        }
        int[] newarr=new int[n];
        System.out.println("your sorted array is : ");
        for (int i=0;i< args.length;i++){
            for (int j = 0; j < arr.length; j++) {
                if (arr[i]==arr[j]){
                    continue;
                }
                if (arr[i]!=arr[j]){
                    System.out.println(arr[i]);
                }
            }
        }
        System.out.println(newarr);

    }
}
