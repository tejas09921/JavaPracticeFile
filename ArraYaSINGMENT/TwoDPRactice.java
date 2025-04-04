package ArraYaSINGMENT;

import java.util.Scanner;

public class TwoDPRactice {
    static void PrintMatri(int a[][]){
        int n= a.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }

    }
    static void add(int[][] a,int r1,int c1,int[][] b,int r2,int c2) {
        if (r1 != r2 || c1 != r2) {
            System.out.println("Rong input additon not Possible");
            return;
        }

        int sum[][] = new int[r1][c1];
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                sum[i][j] = a[i][j] + b[i][j];
            }
        }
        PrintMatri(sum);
    }

    static void SumOfTwoD(int[][] a,int[][]b,int r1,int c1){
        int sum1=0;
        int sum2=0;
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                sum1=a[i][j]+sum1;
            }
        }
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                sum2=a[i][j]+sum2;
            }
        }
        System.out.println("Aditon of 2d array is: "+sum1+sum2);
    }
    static void TransPoseofMatrix(int[][] a,int r1,int c1){
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                a[i][j]=a[j][i];
            }
        }
        System.out.println("Your Transpose of matrix is :");
        PrintMatri(a);
    }

    static void Row_And_Column_Addition(int[][] a,int r1,int c1) {
        int additionofrow=0;
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                additionofrow=additionofrow+a[i][j];
            }
        }
        int ColumnAdditon=0;
        System.out.println("Row addtion is : "+additionofrow);
        for (int j = 0; j < c1; j++) {

            for (int i = 0; i < r1; i++) {
                ColumnAdditon=ColumnAdditon+a[i][j];
            }
        }
        System.out.println("ColumnAdditon Is : "+ColumnAdditon);
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

//        System.out.println("enter the num of row and column for matrix2");
//        int r2= sc.nextInt();
//        int c2= sc.nextInt();
//        int b[][]=new int[r1][c1];
//        System.out.println("Enter Matrix Values");
//        for (int i = 0; i < r1; i++) {
//            for (int j = 0; j < c1; j++) {
//                b[i][j]= sc.nextInt();
//            }
//        }

        //add(a,r1,c1,b,r2,c2);
        //SumOfTwoD(a,b,r1,c1);
        //TransPoseofMatrix(a,r1,c1);
       // Row_And_Column_Addition(a,r1,c1);
    }
}
