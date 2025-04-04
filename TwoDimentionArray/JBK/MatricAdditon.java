package TwoDimentionArray.JBK;

import java.util.Scanner;

public class MatricAdditon {
//    static int matixADD(){
//
//    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the row size of matrix 1: ");
        int r1= sc.nextInt();
        System.out.println("enter the  column size of matrix 1: ");
        int c1= sc.nextInt();
        int [][] arr1=new int[r1][c1];
        System.out.println("Enter the "+r1*c1+" values of Matrix");
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                arr1[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter the row size of matrix 2: ");
        int r2= sc.nextInt();
        System.out.println("enter the  column size of matrix 2: ");
        int c2= sc.nextInt();
        int [][] arr2=new int[r2][c2];
        System.out.println("Enter the "+r2*c2+" values of Matrix");
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                arr2[i][j]=sc.nextInt();
            }
        }
        int[][] add=new int[r1][c1];
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                add[i][j]=arr1[i][j]+arr2[i][j];
            }
        }
        System.out.println("your enter array Addition is : ");
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                System.out.print(add[i][j]+" ");
            }
            System.out.println();
        }

    }
}
