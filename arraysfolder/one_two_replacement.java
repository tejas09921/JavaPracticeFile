package arraysfolder;

import jdk.dynalink.beans.StaticClass;

import java.util.Scanner;
//output ny yet aahe yach
    public class one_two_replacement {
         static int[] rotate(int[] arr, int k) {
            int n = arr.length;
            k = k % n;
            int[] ans = new int[n];
            int j = 0;

            for (int i = n - k; i <= n; i++) {
                ans[j++] = arr[i];
            }
            for (int i = 0; i < n - k; i++) {
                ans[j++] = arr[i];
            }

        return ans;
         }

        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("enter array size");
            int n= sc.nextInt();
            int [] arr=new int[n];
            System.out.println("enter"+n+"number of element");
            for (int i = 0; i < n; i++) {
                arr[i]= sc.nextInt();
            }
            System.out.println("enter k: ");
            int k= sc.nextInt();

            System.out.println("original array :");
            System.out.println(arr);
            int[] ans=rotate(arr,k);
            System.out.println("arrey after rotation");
            System.out.println(ans);
        }
    }


