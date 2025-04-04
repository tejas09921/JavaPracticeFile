package to_D_ARR_PROb;

import java.util.Scanner;

public class TRansfrom {

    static int findTranspose(int [][] matrix,int r,int c){
        int [][] ans =new int[r][c];
        for (int i = 0; i < c; i++) {
            for (int j = 0; j < r; j++) {
                ans[i][j]=matrix[j][i];
            }
        }
        return ans[r][c];
    }
    static void printmatrix(int[][] matrix){
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.println(matrix[i][j]+" ");
            }
            System.out.println();
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

        System.out.println("Transpose matrix is:");
       // int[][] ans = findTranspose(matrix, r, c);
        // printmatrix(ans);
       findTranspose(matrix,r,c);

    }
}
//yach na output ny show hota aahe comment wal baghava lagnar