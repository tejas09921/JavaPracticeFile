package arraysfolder;

public class weglach {

    static void printarry(int[] arr){
        for (int i=0;i< arr.length;i++){
            System.out.println(arr[i]+" ");
        }
        System.out.println();
    }


    public static void main(String[] args) {


        System.out.println();
        int[] arr= new int[5];
        arr[0]=5;
        arr[1]=6;
        arr[2]=8;
        arr[3]=9;
        arr[4]=7;
        System.out.println("original array");
        printarry(arr);
        System.out.println("dublicate / copied array");
        int[] arr_2=arr;
        printarry(arr_2);
    }
}
