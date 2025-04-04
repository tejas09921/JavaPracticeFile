package arraysfolder;

import java.util.Scanner;

public class inputarr {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of arrey");
        int n= sc.nextInt();
        int arr[]=new int[n];

        System.out.println("entr the array "+ n +" size ");
        for (int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        for (int i=0;i<n;i++){
            System.out.println(arr[i]);
        }

    }
}
