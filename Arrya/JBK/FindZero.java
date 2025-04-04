package Arrya.JBK;

import java.util.Scanner;

public class FindZero {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n= sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter the element of arrry");
        for (int i = 0; i < arr.length; i++) {
            arr[i]= sc.nextInt();
        }
        System.out.println("the count of zeros is: ");
        int count=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==0){
                count++;
            }
        }
        System.out.println(count);
    }
}
