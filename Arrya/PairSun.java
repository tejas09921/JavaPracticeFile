package Arrya;

import java.util.Scanner;

public class PairSun {
    static void PairsumTwoNUm(int [] arr,int target){
        int count=0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] + arr[j]==target) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
    static void PairSumThreeNum(int [] arr,int target){
        int count=0;
        int n=arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                for (int k = j+1; k <n; k++) {
                    if (arr[i] + arr[j]+arr[k]==target) {
                        count++;
                    }
                }
            }

        }
        System.out.println(count);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value of n :");
        int n= sc.nextInt();
        int arr[]=new int[n];
        System.out.println("enter the values of array");
        for (int i = 0; i < arr.length; i++) {
            arr[i]= sc.nextInt();
        }
        System.out.println("enter the target value");
        int target= sc.nextInt();
        PairsumTwoNUm(arr,target);
        PairSumThreeNum(arr,target);
    }
}
