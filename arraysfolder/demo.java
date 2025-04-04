package arraysfolder;

public class demo {
    void demo_array(){
        int[] ages=new int[3];
        float[] weight=new float[3];
        String[] names=new String[3];
        ages[0]=10;
        ages[1]=20;
        ages[2]=30;
        System.out.println(ages[0]);
        System.out.println(ages[1]);
        System.out.println(ages[2]);
        // loop n print karun pahil
        for (int i=0;i<3;i++){
            System.out.println(ages[i]);
        }
    }
    public static void main(String[] args) {

        demo obj=new demo();
        obj.demo_array();
    }
}
