package TwoDarr;

import java.util.Scanner;

public class SpiralOrder {
    static void Printmatrix(int[][] arr,int r,int c){
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    static void PrintSpiralOrder(int[][] arr,int r,int c){
        int toprow=0; int bottomrow=r-1; int leftcol=0; int rightcol=c-1;
        int Totalelement=0;
        while (Totalelement<r*c){
            for (int j = leftcol; j < rightcol; j++) {
                System.out.println(arr[leftcol][j]);
                Totalelement++;
            }
            toprow++;
            for (int i = toprow; i < bottomrow; i++) {
                System.out.println(arr[i][rightcol]);
                Totalelement++;
            }
            rightcol--;
            for (int j = rightcol; j < leftcol; j--) {
                System.out.println(arr[bottomrow][j]);
                Totalelement++;
            }
            bottomrow--;
            for (int i = bottomrow; i < toprow; i--) {
                System.out.println(arr[i][leftcol]);
                Totalelement++;
            }
            leftcol++;

        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Size of array row and colomn");
        int r= sc.nextInt();
        int c= sc.nextInt();
        int [][] arr=new int[r][c];
        System.out.println("Enter the element on array"+(r*c));
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                arr[i][j]= sc.nextInt();
            }
        }
        //Printmatrix(arr,r,c);
        PrintSpiralOrder(arr,r,c);

    }
}
