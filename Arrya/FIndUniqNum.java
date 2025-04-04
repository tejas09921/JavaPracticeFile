package Arrya;

import java.util.Scanner;

public class FIndUniqNum {
    int FindMaxNum(int[] arr){
        int min=Integer.MIN_VALUE;
        System.out.println(min);
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i]<arr[j]){
                  min=arr[i];
                }
            }
        }
        return min;
    }

   int  FindUnicNum(int []arr,int unic){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i]==arr[j]){
                    arr[i]=-1;
                    arr[j]=-1;
                }
            }

        }
        int ans=-1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>0){
                ans=arr[i];
            }
        }
       return ans;
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
        //System.out.println("Enter the unic number: ");
//        int unic= sc.nextInt();
        FIndUniqNum f1= new FIndUniqNum();
        //f1.FindUnicNum(arr,unic);
        f1.FindMaxNum(arr);

    }
}
