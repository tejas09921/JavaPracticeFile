package StringJBK;

import java.util.Scanner;

public class quation7 {
    public static void main(String[] args) {
        System.out.println("Reverse the string using string bufer: ");
        StringBuilder sb = new StringBuilder("Tejas patil");

        sb.reverse();

        System.out.println(sb.toString());

        //acurance of character 8
        System.out.println("Print the repetation of num: ");
        String str="samadhankokate";
        char sk[]=str.toCharArray();
        System.out.println("Enter the num to check their occurance: ");
        Scanner sc=new Scanner(System.in);
        String ch=sc.next();
        int Count=0;
        for (int i = 0; i < sk.length-1; i++) {
            System.out.println(i);
        }
        System.out.println(Count +"Times occure this character");
    }
}
