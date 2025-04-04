package StringJBK;

import java.util.Scanner;
public class Anagram {
    public void checkAnalogram(String str1,String str2){
        if(str1.length() !=str2.length()){
            System.out.println("Operation can not perform");
            return;
        }
        char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();
        int start=0;
        int end=str1.length();
        for (int i = 0; i < charArray1.length; i++) {
            for (int j = 0; j < charArray2.length; j++) {
                if (charArray1[i]==charArray2[j]){
                    System.out.println("it is anologram");
                }else {
                    System.out.println("it is not a anologram");
                }
                break;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the First String: ");
        String str1= sc.next();
        System.out.println("Enter the First String: ");
        String str2= sc.next();
        Anagram a=new Anagram();

        a.checkAnalogram(str1,str2);

    }
}
