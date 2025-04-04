package TCSnqt;

import java.util.Scanner;

public class exm1 {
    static void Printarr(int arr[]){
        int count=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]!=0){
                System.out.print(arr[i]);


            }else {
                count++;
                arr[i]=0;
                System.out.print(arr[i]);
            }

        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //this p[rogram quation is to find the ans empty chocolets in the the factry
        System.out.println("enter the size of array");
        int n = sc.nextInt();
        int arr[]=new int[n];
        System.out.println("enter the num of "+ n +"element");

        for (int i = 0; i < arr.length; i++) {
            arr[i]= sc.nextInt();
        }
        Printarr(arr);
    }
}
