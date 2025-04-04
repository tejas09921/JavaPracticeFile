package ArraYaSINGMENT;

import java.util.Scanner;

public class RowSortingAndColumnSorting {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of array");
        int r= sc.nextInt();
        int c= sc.nextInt();
        int[][] arr=new int[r][c];
        System.out.println("Enter the "+r*c+" num of element in array: ");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j <c; j++) {
                arr[i][j]=sc.nextInt();
        }
    }
        System.out.println("Sum of each row:");
        for (int i = 0; i < r; i++) {
            int rowSum = 0;
            for (int j = 0; j < c; j++) {
                rowSum += arr[i][j];
            }
            System.out.println("Row " + (i + 1) + " sum = " + rowSum);
        }
        for (int i = 0; i < r; i++) {
            int ColSum=0;
            for (int j = 0; j < c; j++) {
                ColSum+=arr[j][i];
            }
            System.out.println("column "+(i+1)+" sum ="+ColSum);
        }
  }
}