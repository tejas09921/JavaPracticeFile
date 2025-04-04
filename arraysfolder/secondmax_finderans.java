package arraysfolder;
//correct output yet nay aahe yach
import java.util.Scanner;

public class secondmax_finderans {
    static int findmax(int[] arr){

        int max= Integer.MAX_VALUE;
        int n=arr.length;
        for (int i = 0; i < n; i++) {
            if (arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
    static int findsecondmax(int[] arr){

        int max=findmax(arr);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == max) {
                arr[i]=Integer.MIN_VALUE;
            }

        }
        int secondmax=findmax(arr);
        return secondmax;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of arrey");
        int n= sc.nextInt();
        System.out.println("enter the element of arry");
        int[] arr=new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]= sc.nextInt();
        }
        System.out.println("your arr is:");
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
        System.out.println("second max num is: "+findmax(arr));
        System.out.println(findsecondmax(arr));
    }
}
