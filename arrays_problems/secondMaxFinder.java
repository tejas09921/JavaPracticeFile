package arrays_problems;

import java.util.Scanner;

public class secondMaxFinder {
    static int SecondLargest(int[] arr){
            int num=0;
            for (int i = 0; i < arr.length; i++) {
                for (int j = i+1; j < arr.length; j++) {
                    if (arr[i]>arr[j]){
                        num=arr[i];
                        arr[i]=-1;
                    }else {
                        num=arr[j];
                        arr[j]=-1;
                    }
                }
            }
        int num2=0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i]>arr[j]){
                    num2=arr[i];
                }else {
                    num2=arr[j];
                }
            }
        }

            return num2;
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
        System.out.println("Second largest num is:"+SecondLargest(arr));

    }
}
