package sismple;

import java.util.Scanner;

public class area_of_circle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the radious of the circle:");
        float r=sc.nextFloat();
        float area=3.14f*r*r;
        System.out.println("the area of circle is:");
        System.out.println(area);
    }

}
