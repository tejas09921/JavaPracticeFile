package problems;

import java.util.Scanner;

public class discout {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int amount= sc.nextInt();

        if (amount>100){
            System.out.println("discount wil be 10%");
            int discouts=(amount/100)*10;
            System.out.println(discouts);
        } else if (amount<100 && amount>200) {
            System.out.println("discount wil be 10%");
            int discouts=(amount/100)*20;
        }
    }
}
