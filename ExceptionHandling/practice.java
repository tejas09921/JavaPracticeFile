package ExceptionHandling;

public class practice {
    public static void main(String[] args) {
        System.out.println(1);
        System.out.println(2);
        System.out.println(3);
        System.out.println(4);
        int arr[]={1,2};
        try {
            System.out.println(4/0);
            System.out.println(arr[3]);
        }catch (ArithmeticException ae){
            System.out.println(ae);
            System.out.println("Occur arithmetic exception");
        }
        catch (Exception e){
            System.out.println(e);
            System.out.println("I am parent of exception");
        }
    }
}
