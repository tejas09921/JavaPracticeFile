package to_D_ARR_PROb;

import java.util.Scanner;

public class Tran_Two {
    static void printmatrix(int [][] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println(arr[i][j]+ "");
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("entter the num of col in matrix");
        int r= sc.nextInt();
        int c= sc.nextInt();
        int [][] arr=new int[r][c];
        System.out.println("enter"+ r*c +"elemetn in array");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                arr[i][j]= sc.nextInt();
            }
        }
        System.out.println(arr);
        printmatrix(arr);

    }
}
