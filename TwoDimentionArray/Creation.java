package TwoDimentionArray;

import java.util.Scanner;

public class Creation {
    static void Printarray(int arr[][]){
        int n= arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the num of row");
        int r= sc.nextInt();
        System.out.println("Enter the num of column");
        int c= sc.nextInt();
        int arr[][]=new int[r][c];
        System.out.println("Enter the num "+r*c+"elements");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[i][j]= sc.nextInt();
            }
        }
        System.out.println("your array is");
     Printarray(arr);
    }
}