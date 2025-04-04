package Arrya.JBK;

import java.util.Scanner;

public class PalindromNumCheck {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the num  : ");
        int num= sc.nextInt();
        int OringnalNum=num;
        int reverse=0;

        while (num!=0){
            int digit=num%10;
            reverse =reverse*10+digit;
            num=num/10;
        }
        if (OringnalNum==reverse){
            System.out.println(OringnalNum+" is Palindrome numz:");
        }else {
            System.out.println(OringnalNum+" is not a palindrome num");
        }
    }
}
