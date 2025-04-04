package to_D_ARR_PROb;

import java.util.Scanner;

public class ninty_dRotate {
    static void printmatrix(int[][] matrix){
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.println(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }

    static void transposeInPlace(int[][] matrix,int r,int c){
        for (int i = 0; i < c; i++) {
            for (int j = 0; j < r; j++) {
                int temp=matrix[i][j];
                matrix[i][j]=matrix[i][j];
                matrix[j][i]=temp;
            }
        }
    }
    static void rotate(int[][] matrix,int n){
        transposeInPlace(matrix,n,n); //ethe na tya matrix cha transpose yenar
    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("enter num of row and column of matrix");
        int r= sc.nextInt();
        int c= sc.nextInt();
        int [][] matrix=new int[r][c];
        int totalelement=r*c;
        System.out.println("enter matrix "+totalelement+ "value");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                matrix[i][j]= sc.nextInt();
            }
        }
        System.out.println("Input matrix is: ");
        printmatrix(matrix);

    }
}
//apura aahe ha program