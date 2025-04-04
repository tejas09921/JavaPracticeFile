package Two_D_Array;

import java.util.Scanner;

public class add_to_matrix {

    static void printmatrix(int [][] matrix){
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.println(matrix[i][j]+" ");
            }
        }
    }
    static void add(int [][] a,int r1,int c1,int[][] b,int r2,int c2){
        if(r1!=r2 || c1!=c2){
            System.out.println("your enter inout is rong");
            return;
        }
        int [][] sum=new int[r1][c1];
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                sum[i][j]=a[i][j]+b[i][j];
            }
        }
        printmatrix(sum);
    }
    /*
     static void multiply(int [][] a,int r1,int c1,int [][] b,int r2,int c2){
        if (c1 != r2) {
            System.out.println("multiplication is not passble");
            return;
        }
        int [][] mul=new int[r1][c2];
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                for (int k = 0; k < c1; k++) {
                    mul[i][j]+= (a[i][k]*b[k][j]);
                }
                System.out.println("multiplication of mateices");
                multiply(a);
            }

        }// lihalay but rong ahe
     */

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter num of row and column");
        int r1= sc.nextInt();
        int c1= sc.nextInt();
        int [][] a=new int[r1][c1];
        System.out.println("enter matrix value");
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                a[i][j]= sc.nextInt();
            }
        }
        System.out.println("enter num of row and column");
        int r2= sc.nextInt();
        int c2= sc.nextInt();
        int [][] b=new int[r1][c1];
        System.out.println("enter matrix value");
        for (int i = 0; i < r2; i++) {
            for (int j = 0; j < c2; j++) {
                b[i][j]= sc.nextInt();
            }
        }
        System.out.println("matrix one is");
        printmatrix(a);
        System.out.println("matrix two is");
        printmatrix(b);
        add(a,r1,c1,b,r2,c2);
    }
}
