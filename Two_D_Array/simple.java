package Two_D_Array;

public class simple {
    static void printarray(int[][] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int [][] arr2={
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        printarray(arr2);
    }
}
