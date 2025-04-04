package arraysfolder;

import java.util.Scanner;

public class firstrepeterFinder_pW {
    static int firstrepeternum_pw(int[] arr){
        int n= arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                return arr[i];
            }
        }
        return -1;
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
        System.out.println("first repet num is : "+firstrepeternum_pw(arr));
    }
}
