package StringJBK;

import java.util.Scanner;

public class whiteSpaceRemove {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the name to remove all whiteSpases: ");
        String str= sc.nextLine();
        System.out.println("After removeing white spases is :  "+str.replaceAll(" ",""));

    }
}
