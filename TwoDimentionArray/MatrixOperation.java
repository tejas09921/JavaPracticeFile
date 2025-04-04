package TwoDimentionArray;

import java.util.Scanner;

public class MatrixOperation {
    static void PrintMatri(int arr[][]){
        int n= arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

    }
    static void add(int[][] a,int r1,int c1,int[][] b,int r2,int c2){
        if (r1 != r2 || c1 != r2){
            System.out.println("Rong input additon not Possible");
            return;
        }

        int sum[][]=new int[r1][c1];
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                sum[i][j]=a[i][j]+b[i][j];
            }
        }
        PrintMatri(sum);
    }
    static void multiplya(int [][] a,int r1,int c1,int[][] b,int r2,int c2){
        if (r1 != r2 || c1 != r2){
            System.out.println("Rong inpunt multiplication not Possible");
            return;
        }
        int multiplya[][]=new int[r1][c1];
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                multiplya[i][j]=a[i][j]*b[i][j];
            }
        }
        PrintMatri(multiplya);
    }
    static void Division(int [][] a,int r1,int c1,int[][] b,int r2,int c2){
        if (r1 != r2 || c1 != r2){
            System.out.println("Rong inpunt multiplication not Possible");
            return;
        }
        int Division[][]=new int[r1][c1];


    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the num of row and column for matrix1");
        int r1= sc.nextInt();
        int c1= sc.nextInt();
        int a[][]=new int[r1][c1];
        System.out.println("Enter Matrix Values");
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                a[i][j]= sc.nextInt();
            }
        }

        System.out.println("enter the num of row and column for matrix2");
        int r2= sc.nextInt();
        int c2= sc.nextInt();
        int b[][]=new int[r1][c1];
        System.out.println("Enter Matrix Values");
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                b[i][j]= sc.nextInt();
            }
        }

        //add(a,r1,c1,b,r2,c2);
        multiplya(a,r1,c1,b,r2,c2);
    }
}
