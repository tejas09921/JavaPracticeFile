package Recursion;

public class FindSqure {
    static int squre(int p,int q){
        // base ccase
        if (q==0){
            return 1;
        }
        //selp work
        int multiply=squre(p,q-1);
       return multiply*p;
    }
    public static void main(String[] args) {
        System.out.println(squre(2,2));
    }
}
