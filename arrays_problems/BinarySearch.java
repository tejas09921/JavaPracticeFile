package arrays_problems;

import java.util.Scanner;

public class BinarySearch {
    static int keyFinder(int[] arr,int key){
        int start=0; int end=arr.length-1;
        int mid=(start+end)/2;
        while (start<=end){
//            return -1;

            if (arr[mid]==key){
                return key;
            } else if (arr[mid]<key) {
                start=mid+1;
            }else {
                start=mid-1;
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
        System.out.println("enter the key:");
        int key= sc.nextInt();
        System.out.println("your key index is:");
    }
}
