package arrays_problems;

import java.util.Scanner;

public class LinearSearch {
    static int SearchKey(int [] arr,int key){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of arrey");
        int n= sc.nextInt();
        int[] arr=new int[n];
        System.out.println("enter the array element");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("entr the Searrcheble key:");
        int key=sc.nextInt();
        System.out.println(SearchKey(arr,key));
    }
}
