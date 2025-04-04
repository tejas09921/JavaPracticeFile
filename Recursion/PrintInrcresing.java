package Recursion;

public class PrintInrcresing {
    static void PRintInci(int n){
        //base case
        if (n==1){
            System.out.println(n+" ");
            return;
        }
        PRintInci(n-1);
        System.out.println(n+ " ");
    }
    public static void main(String[] args) {
        int n=10;
        PRintInci(n);

    }
}
