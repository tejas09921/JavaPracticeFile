package to_D_ARR_PROb;

import java.util.Scanner;

public class transposeMat {
    static void printmatrix(int[][] matrix){
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.println(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
    static int printtransform(int[][] matrix,int r,int c){
        int [][] ans=new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
               ans[i][j]=matrix[j][i];
            }
        }
        return ans[r][c];
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter total row and column of matrix");
        int r= sc.nextInt();
        int c= sc.nextInt();
        int [][] matrix=new int[r][c];
        System.out.println("enter"+ r*c +"element in the matrix");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                matrix[i][j]= sc.nextInt();
            }

        }
        System.out.println("your enter matrix is");
        printmatrix(matrix);
        System.out.println("your transform matrix result is");
        printtransform(matrix,r,c);
    }
}
