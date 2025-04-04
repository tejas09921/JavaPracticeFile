package Recursion;

public class SumOfDigit {

    static int sod(int n){
        if (n>=0 && n<=9) {
            return n;
        }

        int smallans=sod(n/10);
        return smallans+(n%10);
    }
    public static void main(String[] args) {
        System.out.println(sod(12345));
    }
}
