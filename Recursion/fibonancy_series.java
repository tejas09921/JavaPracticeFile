package Recursion;

public class fibonancy_series {
    static int fib(int n){
        if (n==0 || n==1) {
            return n;
        }

        int prev=fib(n-1);
        int lastprev=fib(n-2);

        return prev +lastprev;

    }
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println(fib(i));
        }
    }
}
