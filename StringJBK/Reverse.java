package StringJBK;

public class Reverse {
    public static void main(String[] args) {
        String s="WelcomeToHood";

        char ch[]=s.toCharArray();
       int left=0;
       int right=s.length()-1;
        System.out.println("before reverse : ");
        for (char c:ch) {
            System.out.print(c+" ");
        }

       while (left<right){
           char temp=ch[left];
           ch[left]=ch[right];
           ch[right]= temp;
           left++;
           right--;
       }
        System.out.println("after reverse : ");
        for (char c:ch) {
            System.out.print(c+" ");
        }


    }
}
