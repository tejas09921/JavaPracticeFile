package arraysfolder;

import java.util.Scanner;

public class secondmax_num {

    static void maxnumfinder(int arr[],int temp){
        int max_num=0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j <arr.length; j++) {
                if (arr[i] > temp) {

                    temp=arr[i];
                }
            }
        }
        return ;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of arrey");
        int n= sc.nextInt();
        System.out.println("enter the element of arry");
        int[] arr=new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]= sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
//yach logic laglay but te fun call ny zal
    }
}
