package TwoDimentionArray.JBK;

import java.util.Scanner;

public class Traverse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the row size of matrix: ");
        int r1= sc.nextInt();
        System.out.println("enter the  column size of matrix: ");
        int c1= sc.nextInt();
        int [][] arr=new int[r1][c1];
        System.out.println("Enter the "+r1*c1+" values of Matrix");
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                arr[i][j]=sc.nextInt();
            }
        }
//        for (int i,j:arr[i][j]) {
//            System.out.println(arr[i][j]);
//        }
    }
}
