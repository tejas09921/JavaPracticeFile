package arraysfolder;

public class maxvalue {
    void maxnum(){
        int arr[]={17,5,3,10,15,20,18};
        int ans=0;
        for (int i=0;i<arr.length;i++){
            if (arr[i]>ans){
                ans=arr[i];
            }
        }
        System.out.println(ans);
    }
    public static void main(String[] args) {
        maxvalue obj=new maxvalue();
        obj.maxnum();
    }
}
