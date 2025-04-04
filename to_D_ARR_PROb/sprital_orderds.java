package to_D_ARR_PROb;

import java.util.Scanner;

public class sprital_orderds {

    static void printmatrix(int[][] matrix){
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.println(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
    static void printSpiralOrder(int[][] matrix,int r,int c){
        if (matrix[r] == matrix[c]) {
            System.out.println("spiral order criteria excepted");
        }
        int toprow=0; int bottomrow=r-1; int leftcol=0; int rightcol=c-1;
        int totalelement=0;
while (totalelement < r*c){

        //top row-> leftcol to rightcol
        for (int j = leftcol; j < rightcol; j++) {
            System.out.println(matrix[toprow][j]+" ");
            totalelement++;
        }
        toprow++;
        //rightcol -> toprow to bottomrow
        for (int i = toprow; i <= bottomrow; i++) {
            System.out.println(matrix[i][rightcol]+" ");
            totalelement++;
        }
        rightcol--;
        //bottomrow -> right to left
        for (int j = leftcol; j >= rightcol; j--) {
            System.out.println(matrix[bottomrow][j]+" ");
            totalelement++;
        }
        bottomrow--;
        //leftcol -> bootmrow to top row
        for (int i = bottomrow; i <=toprow; i--) {
            System.out.println(matrix[i][leftcol]+" ");
            totalelement++;
        }
        leftcol++;
    }
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
        printSpiralOrder(matrix,r,c);
    }
}
