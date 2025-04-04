package Two_D_Array;

import java.util.Scanner;

public class input_two_arr {

    static void print_Array(int[][] arr){

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the num of rows");
        int r= sc.nextInt();
        System.out.println("enter num of column");
        int c=sc.nextInt();
        int [][] arr=new int[r][c];
        System.out.println("enter r*c elements :");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                arr[i][j]= sc.nextInt();
            }

        }
        print_Array(arr);
        //program barobar aahe but output pn yetay but te uubh yetay aadav ny yet ye
    }
}
