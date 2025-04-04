package arrays_problems;

import java.util.Scanner;

public class lastIndexFInd {
    static int indexFinder(int[] arr,int x){
        int lastIndex=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==x){
                lastIndex=i;
            }
        }
        return lastIndex;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of arrey");
        int n= sc.nextInt();
        int[] arr=new int[n];
        System.out.println("enter the array element");
        for (int i = 0; i < arr.length; i++) {
            arr[i]= sc.nextInt();
        }
        System.out.println("enter the num to find last index");
        int x=sc.nextInt();
        System.out.println("last index of array is :"+ indexFinder(arr,x));

    }
}
