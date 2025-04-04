package arrays_problems;

import java.util.Scanner;

public class maxFinder {
    static int FindMax(int[] arr){
        int min=Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (min<arr[i]){
                min=arr[i];
            }
        }
        return min;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of arrey");
        int n= sc.nextInt();
        int[] arr=new int[n];
        System.out.println("enter the array element");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(FindMax(arr));
    }
}
