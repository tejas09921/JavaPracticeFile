package Recursion;

public class PRintarr {
    static void Printarr(int [] arr,int idx){
        //base case
        if (idx== arr.length){
            return;
        }
        //self work
        System.out.println(arr[idx]);
        //rwcursive work
        Printarr(arr,idx+1);
    }
    public static void main(String[] args) {
        int arr[]={5,3,1,4,9,6};
        Printarr(arr,0);
    }
}
