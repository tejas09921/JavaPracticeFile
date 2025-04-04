package StringJBK;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
                // this program is use to count the vovel and
        String str1 = "listen";
        String str2 = "silent";

        char[] ch=str1.toCharArray();
        char[] ch1=str2.toCharArray();
        int count=0;
        for (int i = 0; i < ch.length; i++) {
            for (int j = 0; j < ch1.length; j++) {
                if (ch[i]==ch1[j]){
                   count++;
                }

                if (count==ch.length){
                    System.out.println("this is a analygram");
                }else {
                    System.out.println("it is not a analygram");
                }
            }
            break;
        }

    }
}
