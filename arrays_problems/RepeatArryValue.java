package arrays_problems;

import java.util.Scanner;

public class RepeatArryValue {
    static int repeater(int[] arr){
        int n= arr.length;
        for (int i = 0; i <n ; i++) {
            for (int j = i+1; j < n; j++) {
                if (arr[i]==arr[j]){
                    return arr[i];
                }
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
        System.out.println("Repeat Value is:"+repeater(arr));
    }
}
