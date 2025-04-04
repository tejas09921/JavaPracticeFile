package Arrya;
import java.util.*;
public class simple_obj {
    void maxArry(){
        int[] arr={1,2,3,4,5,6,7,8,9};
        int ans=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>ans){
                ans=arr[i];
            }
        }
        System.out.println("Max"+ans);
    }
    void Addition(){
        int[] arr={1,2,3,4,5,6,7,8,9};
        int ans=0;
        for (int i = 0; i < arr.length; i++) {
            ans=ans+arr[i];
        }
        System.out.println("Adition of array is: "+ans);
    }

    public static void main(String[] args) {
        simple_obj obj=new simple_obj();
        obj.maxArry();
        obj.Addition();

    }
}
