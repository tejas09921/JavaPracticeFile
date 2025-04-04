package arrays_problems;

import java.util.Scanner;

public class uniqElementFind {
    static int UniqElement(int[] arr){
        int uniq=0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i]==arr[j]){
                    arr[i]=-1;
                    arr[j]=-1;
                }
            }

        }
        int ans=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>0){
                ans=arr[i];
            }
        }
        return ans;
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
        System.out.println("uniq element is :"+ UniqElement(arr));
    }
}
