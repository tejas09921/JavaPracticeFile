package TwoDarr;

import java.util.Scanner;

public class Transpose {
    static void Printmatrix(int[][] arr,int r,int c){
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    static int[][] FindTranspose(int[][] arr,int r,int c){
        int [][] ans=new int[c][r];
        for (int i = 0; i < c; i++) {
            for (int j = 0; j < r; j++) {
                ans[i][j]=arr[j][i];
            }
        }
        return ans;
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
        System.out.println("Your enter matrix is:");
        Printmatrix(arr,r,c);
        System.out.println("Transpose array is");
       int[][] ans=FindTranspose(arr,r,c);
        System.out.println(ans);
    }
}
// i dont know why does not show th eoutput
