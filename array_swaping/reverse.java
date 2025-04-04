package array_swaping;

public class reverse {
    static void swapInArry(int[] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;

    }
    static int reversearry(int[] arr){
        int count=0;
        int i=0; int j=arr.length-1;
        while (i<j){
            i++;
            j--;
        }
        return count;
    }
    
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6};
        reversearry(arr);

    }
}
