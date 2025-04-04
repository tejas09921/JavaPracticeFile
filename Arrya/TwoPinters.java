package Arrya;

import java.util.Scanner;

public class TwoPinters {
    void CountpairSumTwo(int[] arr,int target){
        int count=0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i]+arr[j]==target){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
    void CountPairSumThreeInt(int[] arr,int target){
        int count=0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                for (int k = j+1; k < arr.length; k++) {
                    if (arr[i] + arr[j] + arr[k]==target) {
                        count++;
                    }
                }
            }
        }
        System.out.println(count);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("enter the size of array");
        int n= sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter the Element of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i]= sc.nextInt();
        }
        System.out.println("Enter the target element");
        int target= sc.nextInt();
        TwoPinters p1=new TwoPinters();
        p1.CountpairSumTwo(arr,target);
        p1.CountPairSumThreeInt(arr,target);
    }
}
