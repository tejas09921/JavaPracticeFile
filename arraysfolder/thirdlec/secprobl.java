package arraysfolder.thirdlec;

import java.util.Scanner;

public class secprobl {
    static int tripletsum(int[]arr,int target){
        int ans=0;
        int n= arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j <n; j++) {
                for (int k = j+1; k <n; k++) {
                    if (arr[i]+arr[j]+arr[k]==target){
                        ans++;
                    }
                }
            }

        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the sixe eof aray");
        int n= sc.nextInt();
        int[] arr=new int[n];
        System.out.println("enter the"+n+"num of element");
        for (int i = 0; i < n; i++) {
            arr[i]= sc.nextInt();
        }
        System.out.println("and of this is");
        int target=sc.nextInt();
        System.out.println(tripletsum(arr,target));
    }
}
