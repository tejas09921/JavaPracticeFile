package swap;

public class AndBswap {
    static void swapAndB(int a,int b){
        System.out.println("values after swap:");
        System.out.println("A:"+a);
        System.out.println("b:"+b);
        int temp=a;
        a=b;
        b=temp;



        System.out.println("values befour swap:");
        System.out.println("A:"+a);
        System.out.println("b:"+b);
    }
    public static void main(String[] args) {
        int a=5;
        int b=10;
        swapAndB(a,b);
    }
}
