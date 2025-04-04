import java.util.Scanner;

public class ArrayTwoD {
    void Printarr(int[][] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the num of rows");
        int r=sc.nextInt();
        System.out.println("enter the num of column");
        int c= sc.nextInt();
        int[][] arr=new int[r][c];
        System.out.println("Enter the "+r*c+" values in these array");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[i][j]= sc.nextInt();
            }
        }
        ArrayTwoD a=new ArrayTwoD();
        a.Printarr(arr);
    }
}
