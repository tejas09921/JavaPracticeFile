package Recursion;

public class Fibonancy {
    static int fib(int n){
        //base case
        if (n==0 || n==1){
            return n;
        }
        //subprobolem
        int prev=fib(n-1);
        int preprev=fib(n-2);
        //selp work
        int ans= prev+preprev;
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(fib(6));
        // ethe loop laun firsrt n numbers pan tu print karu shakto
    }
}
