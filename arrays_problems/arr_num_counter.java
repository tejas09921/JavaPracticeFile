package arrays_problems;

import java.util.Scanner;

public class arr_num_counter {
    static int arrCounter(int[] arr,int x){
        int count=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==x){
                count++;
            }
        }
        return count;

    }
    public static void main(String[] args) {
        System.out.println("enter the size of arry");
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int arr[]=new int[n];
        System.out.println("enter array element");
        for (int i = 0; i < arr.length; i++) {
            arr[i]= sc.nextInt();
        }
        System.out.println("enter the counter num will be count you");
        int x= sc.nextInt();
        System.out.println("the num repitation is:"+arrCounter(arr,x));

    }
}
