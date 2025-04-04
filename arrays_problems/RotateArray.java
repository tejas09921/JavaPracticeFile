package arrays_problems;

import java.util.Scanner;

public class RotateArray {
//    static int arrRotate(int[] arr,int k){
//
//    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of arrey");
        int n= sc.nextInt();
        int[] arr=new int[n];
        System.out.println("enter the array element");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("enter the value of k to rotate the array:");
        int k= sc.nextInt();
    }
}
