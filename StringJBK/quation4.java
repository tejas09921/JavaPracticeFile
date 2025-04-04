package StringJBK;

public class quation4 {
    public static void main(String[] args) {
        System.out.println("vovel count pro; ");
        String str="TejasPatil";
        char ch[]=str.toCharArray();
        int Count=0;
        for (int i = 0; i < ch.length-1; i++) {
            if (ch[i]=='a'|| ch[i]=='e'|| ch[i]=='i'|| ch[i]=='o'|| ch[i]=='u'){
                Count++;
            }
        }
        System.out.println("TOtal vovels in string is: "+Count);
    }
}
