package arraysfolder.secondlec;

import java.util.Scanner;

public class quation {

    static int countOccurance(int[] arr,int x){
        int count=0;
        for (int i=0;i<arr.length;i++){
            if (arr[i]==x){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of arry");
        int n= sc.nextInt();
        System.out.println("enter the element of arry");
        int arr[]=new int[n];
       for (int i=0;i<n;i++){
           arr[i]= sc.nextInt();
       }
        System.out.println("enter the value of x");
       int x= sc.nextInt();

        System.out.println("your value of x is:"+countOccurance(arr,x));

    }
}
