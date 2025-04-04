package StringJBK;

import java.util.Scanner;

public class quation8Gmail {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENter the gmail Address: ");
        String str=sc.nextLine();
        if (str.endsWith("gmail.com")){
            System.out.println("it is valid gmail address");
        }else {
            System.out.println("It is not a valid gmail address ");
        }
    }
}
