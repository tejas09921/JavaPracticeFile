package Arrya;

import java.util.Scanner;

public class FIndMaxandMIn {
    public static void main(String[] args) {
        System.out.println("your aray is");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n= sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter the element of arrry");
        for (int i = 0; i < arr.length; i++) {
            arr[i]= sc.nextInt();
        }
        int max=0;
        int min=arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>max){
                max=arr[i];
            }
            if (arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println("maximum num of array is :"+max);
        System.out.println("manimum num of array is :"+min);

    }
}
