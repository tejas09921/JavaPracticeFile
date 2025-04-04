package array_swaping;

public class firstswp {
    static void swapwithoutTemp(int a,int b){
        System.out.println("original values before swapped");
        System.out.println("value a:"+a);
        System.out.println("value b:"+b);

        System.out.println("values after swap");
        a=a+b;
        b=b-a;
        a=a-b;
        System.out.println("value a:"+a);
        System.out.println("value b:"+b);
    }
    static void swap(int a,int b){
        System.out.println("original values before swapped");
        System.out.println("value a:"+a);
        System.out.println("value b:"+b);
        System.out.println("values after swap");
        /*
        a=b;//yan na kay zal na b chi value a zali aani toch b a la assign kela
        b=a;
        //yasathi na khalchi step aahe na ti karaychi
         */
        int temp=a;
        a=b;
        b=temp;         //aata output nemkan yenar
        System.out.println("value a:"+a);
        System.out.println("value b:"+b);
    }
    public static void main(String[] args) {
        int a=9;
        int b=3;
        int[] arr={1,2,3,4,5};
       // swap(a,b);
        swapwithoutTemp(a,b);
    }
}
