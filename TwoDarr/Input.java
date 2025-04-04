package TwoDarr;

import java.util.Scanner;

public class Input {
    static void Printarr(int[][] arr,int r,int c){
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println(" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of row and column");
        int r= sc.nextInt();
        int c= sc.nextInt();
        int [][] arr=new int[r][c];
        System.out.println("enter the element in array");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                arr[i][j]= sc.nextInt();
            }
        }
        Printarr(arr,r,c);
    }
}
