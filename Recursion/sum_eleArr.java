package Recursion;

public class sum_eleArr {
    static int SumofArray(int [] arr,int idx){
        //base case
        if (idx== arr.length){
            return 0;
        }
        //recursive work
        int smallarr=SumofArray(arr,idx+1);
        //self work
        return smallarr+arr[idx];
    }
    public static void main(String[] args) {
        int [] arr={5,6,4,7,8,9};
        System.out.println(SumofArray(arr,0));
    }
}
