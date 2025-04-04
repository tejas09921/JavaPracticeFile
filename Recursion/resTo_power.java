package Recursion;

public class resTo_power {
    static int power(int p,int q){
        if (q==0){
            return 1;
        }
        // simplebprob
        int smallans=power(p,q-1);
        int ans=smallans*p;
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(power(2,3));// p is a num and q is a res to power

    }
}
