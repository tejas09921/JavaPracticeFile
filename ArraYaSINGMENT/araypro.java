package ArraYaSINGMENT;

import java.util.Scanner;

public class araypro {
    static void Printarr(int[] arr){
        System.out.println("Your Enter array is: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
    static void ArraySum(int[] arr){
        int sum=0;
        System.out.println("sum of array is :");
        for (int i = 0; i < arr.length; i++) {
            sum=sum+arr[i];
        }
        System.out.println(sum);
    }
    static void LargetAndSmallest(int[] arr){
        int large=0;
        int small=0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] >0) {
                    large=arr[i];
                }
                if (arr[i]<arr[j]){
                    arr[i]=small;
                }
            }
        }
        System.out.println("Large num is: "+large);
        System.out.println("Small num is : "+small);
    }
    static void CountEvenAndOdd(int[] arr){
        int even=0;
        int odd=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]%2==0){
                even++;
            }else {
                odd++;
            }
        }
        System.out.println("Enven num are: "+even);
        System.out.println("odd num are: "+odd);
    }
    static void SearchAnElement(int[] arr){
        Scanner sc=new Scanner(System.in);
        System.out.println("ennter the elemet want to be saerch: ");
        int element= sc.nextInt();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==element){
                System.out.println("Element is found in location :"+i);
            }else {
                System.out.println("element can not be found");
            }
        }
    }
//    static int arrReverse(int[] arr){
//        for (int i = arr.length; i >0; i--) {
//            System.out.println(arr[i]);
//        }
//    }
    static void DuplicateElemet(int[] arr){
        int[] arr2=new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i]==arr[j]){
                    arr[j]=0;
                }
            }
        }
        Printarr(arr);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of array");
        int n= sc.nextInt();
        System.out.println("enter the elemt of aaray");
        int[] arr=new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i]= sc.nextInt();
        }
        //Printarr(arr);
        //ArraySum(arr);//1
       //LargetAndSmallest(arr);//2
//        CountEvenAndOdd(arr);
//        SearchAnElement(arr);
//          DuplicateElemet(arr);
        // arrReverse(arr);

    }
}
