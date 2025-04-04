package methods;

public class simple{
    int algebra(int a, int b){

        int c= a + b;
        return c;
    }
    public static void main(String[] args) {
        simple obj=new simple();
        System.out.println(obj.algebra(5,6));
    }
}
