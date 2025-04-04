package TwoDarr;

import java.util.Scanner;

public class EvenOddPr {
    static void PrintEvenOdd(int n){
        int lastdit=1;
        if ((n & lastdit)==0){
            System.out.println("even num");
        }else {
            System.out.println("odd num");
        }
    }
    public static void main(String[] args) {
        PrintEvenOdd(5);
        PrintEvenOdd(11);
        PrintEvenOdd(14);
    }
}
