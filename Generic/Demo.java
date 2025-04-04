package Generic;
import java.util.*;

public class Demo {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();  //in this type of list can not be add diff datatype
        list.add("sumas");

        List anotherlist=new ArrayList<>(); // but this list it addeed all type to store their list
        anotherlist.add("sumas");
        anotherlist.add(123);
        anotherlist.add(12.20);
        System.out.println(list);
        System.out.println(anotherlist);
    }
}
