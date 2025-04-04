package StringJBK;

import java.util.Scanner;

public class quation2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the two string if check the hav equal: ");
        String s1= sc.nextLine();
        String s2=sc.nextLine();
        if (s1==s2){
            System.out.println("Strings are equal");
        }else {
            System.out.println("String is not equal");
        }
    }
}
