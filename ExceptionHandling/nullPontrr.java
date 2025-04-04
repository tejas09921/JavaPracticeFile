package ExceptionHandling;

public class nullPontrr {
    public static void main(String[] args) {
        String name=null;
        try {
            System.out.println(name.length());
        }catch (NullPointerException e){
            System.out.println("Define String length");
        }
        System.out.println("Program end");
    }
}
