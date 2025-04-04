package arraysfolder;

public class searchindex {
    void serching(){
        int arr[]={8,7,9,6,5,4,1,2,3};
        int value=2;

        for (int i=0;i< arr.length;i++){
            if (arr[i]==value){
                System.out.println(i);
            } else {
                System.out.println("1");
            }
        }
    }
// yach n thod logic chukly but ans 7 n same aahe bas i nako vhayla etke print
    public static void main(String[] args) {
        searchindex obj=new searchindex();
        obj.serching();
    }
}
