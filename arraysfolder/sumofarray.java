package arraysfolder;

public class sumofarray {
    void calcu(){
        int arr[]={5,7,6,8,5,4};
        int sum=0;

        for (int i=0;i< arr.length;i++){
            sum=sum+arr[i];

        }
        System.out.println(sum); // he print jar for loop madhe print cya khali lihal na tar to konta algo yetoy 0,1,1,2,3,5,7 wala
    }
    public static void main(String[] args) {
        sumofarray obj=new sumofarray();
        obj.calcu();
    }
}
