package StringJBK;

import java.util.Scanner;

public class MiddelIndex {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the string: ");
        String input=sc.nextLine();
        StringBuffer str=new StringBuffer(input);
        str.reverse();
        int middleIndex=str.length()/2;
        System.out.println("Middle index is"+middleIndex);
    }
}
