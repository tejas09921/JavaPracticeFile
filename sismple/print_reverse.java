package sismple;

public class print_reverse {
    public static void main(String[] args) {
        int n=56985;
        while (n>0){
            int lastdigit=n%10;
            System.out.print(lastdigit+" ");
            n=n/10;
        }
    }
}
