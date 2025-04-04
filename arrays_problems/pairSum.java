package arrays_problems;

import java.util.Scanner;

public class pairSum {
    static int pairsum(int[] arr,int x){
        int count=0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i]+arr[j]==x){
                    count++;
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of arrey");
        int n= sc.nextInt();
        int[] arr=new int[n];
        System.out.println("enter the array element");
        for (int i = 0; i < arr.length; i++) {
            arr[i]= sc.nextInt();
        }
        System.out.println("enter the num to pair the sum");
        int x=sc.nextInt();
        System.out.println("the sum of pair is :"+pairsum(arr,x));
    }
}
