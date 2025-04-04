package ExceptionHandling;

import java.util.Scanner;

public class arrayoutodbound  {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of an array");
        int n= sc.nextInt();
        int[] arr=new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i]= sc.nextInt();
        }
        System.out.println("Enter the num you want to be search: ");
        int index= sc.nextInt();
        int count=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==index){
                count++;
                break;
            }
        }
        try {
            System.out.println("element found  ;"+arr[index]/0);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Give an index within eange");
        }catch (Exception e){
            System.out.println("Exceptin handling");
        }
        System.out.println("Bye");


    }
}
