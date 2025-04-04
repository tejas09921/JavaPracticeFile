package TwoPointer_arr;

import java.util.Scanner;

public class Count_Zeros {
    static int zeroCOunter(int[] arr){
        int count=0;
        int n=arr.length;
        for (int i = 0; i <n; i++) {

                if (arr[i]==0) {
                 count++;
                }
            }

        return count;
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
        System.out.println("your arr is:");
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
        System.out.println("total num of zeroa are :"+zeroCOunter(arr));
    }
}
