package Recursion;

import java.util.Scanner;

public class facto_c_b_me {
    static int print_facto(int n){
        if (n==0) return 1;

        int smallans= print_facto(n-1);
        int ans=smallans*n;

        return ans;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        print_facto(5);
    }
}
