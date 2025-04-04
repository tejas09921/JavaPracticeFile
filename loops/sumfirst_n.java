package loops;

import java.util.Scanner;

public class sumfirst_n {
    public static void main(String[] args) {
        //this program print to sum of first n natural numbers
        Scanner sc=new Scanner(System.in);
        int sum=0;
        System.out.println("enter the value of n to print sum:");
        int n= sc.nextInt();
        int i=1;
        while (i<=n){
            sum=sum+i;
            i++;
        }
        System.out.println(sum);


    }
}
