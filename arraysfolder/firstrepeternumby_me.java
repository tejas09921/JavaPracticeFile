package arraysfolder;

import java.util.Scanner;

public class firstrepeternumby_me {

    // ha lihlay first repeter sathi pan ha second repeter detoy
//aani jar nit ran kela tar arr[0] position cha num jar repert hot nasel tar nas barobar aahe yach
        static int first_repiter(int[] arr){
            int repeter=0;
            int n= arr.length;
            for (int i = 0; i <n; i++) {
                for (int j = i+1; j < n; j++) {
                    if (arr[i]==arr[j]){
                        repeter=arr[i];
                        System.out.println(repeter);
                    }
                }

            }
            return repeter;
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
            System.out.println("first reeter num is: "+first_repiter(arr));
        }
    }