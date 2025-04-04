package problems;

import java.util.Scanner;

public class tree_n_one {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter any num to soleved 3n+a pronlem");
        int a=sc.nextInt();

        while (a==1){
            System.out.println("problem already sorted");
            System.out.println(a);
        } if (a%2==0) {
            a=a/2;
            System.out.println(a);
        } else {
            a=((a*3)+1);
        }

    }
}
