package Recursion;

public class Factorial {
    static int PrintFactorial(int n){
        //base case
        if (n==0){
            return 1;
        }
        //smaller problem
        int smallans=PrintFactorial(n-1);
        //recursive work
        int ans=(n*smallans);
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(PrintFactorial(4));
    }
}
