package ExceptionCreation.Practice;

public class firstPractice {
    public static void main(String[] args) {
        int[] a={0,1,2};
        String name=null;
        int n1=22;
        int n2=0;
        System.out.println("Hellow");
        try {
            System.out.println(a[8]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("array size out if bound");
        }
        try {
            System.out.println(n1/n2);
        }catch (ArithmeticException e){
            System.out.println("DO not perform any operation divide by zero");
        }

        System.out.println("succsesfull termination");


    }
}
