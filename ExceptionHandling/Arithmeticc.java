package ExceptionHandling;

import java.util.Scanner;

public class Arithmeticc {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first num:");
        int n1= sc.nextInt();
        System.out.println("Enter the second num:");
        int n2= sc.nextInt();
        if (n2==0){
            try {

                System.out.println(n1/n2);
            }catch (ArithmeticException e){
                System.out.println("Enter the second num non zero");
            }
        }

    }
}
