package TwoDarr;

import java.util.Scanner;

public class matrixAddition{
    static void Printarr(int[][] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println(" ");
        }
    }
    static void add(int[][] arr1,int r1,int c1,int[][] arr2,int c2,int r2){
        if (r1 != r2 || c1 != c2){
            System.out.println("Rong input addtition not possible");
            return;
        }
        int [][] sum =new int[r1][c1];
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                sum[i][j]=arr1[i][j]+arr2[i][j];
            }

        }
        Printarr(sum);
    }


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of row and column for matrix one");
        int r1= sc.nextInt();
        int c1= sc.nextInt();
        int [][] arr1=new int[r1][c1];
        System.out.println("enter the element in array");
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                arr1[i][j]= sc.nextInt();
            }
        }
        System.out.println("enter the size of row and column for matrix one");
        int r2= sc.nextInt();
        int c2= sc.nextInt();
        int [][] arr2=new int[r2][c2];
        System.out.println("enter the element in array");
        for (int i = 0; i < r2; i++) {
            for (int j = 0; j < c2; j++) {
                arr2[i][j]= sc.nextInt();
            }
        }
        add(arr1,r1,c1,arr2,r2,c2);
    }
}
