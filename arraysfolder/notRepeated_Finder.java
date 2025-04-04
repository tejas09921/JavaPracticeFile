package arraysfolder;

import java.util.Scanner;

public class notRepeated_Finder {
    static int findUnic(int[] arr){
        int n= arr.length;
        for (int i = 0; i < n; i++) {
            for (int j =i+1; j <n; j++) {
                if (arr[i]==arr[j]) {
                    arr[i]=-1;
                    arr[j]=-1;
                }
            }
        }
        int ans=-1;
        for (int i = 0; i < n; i++) {
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
        System.out.println("enter the element of arry");
        int[] arr=new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]= sc.nextInt();
        }
        System.out.println("your arr is:");
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
        System.out.println("the unic num is wil not the repeted: "+ findUnic(arr));
    }
}
