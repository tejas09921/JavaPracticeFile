package PracticequaaationsJBk;

import java.util.Scanner;

public class Firstassignment {
    public static void checkVovel(char ch){
        switch (ch){
            case 'a': case 'e': case 'i': case 'o': case 'u':
                System.out.println(ch+" is a vovel");
                break;
            default:
                System.out.println(ch+" is consonant");
        }
    }
    public static void checkleafyear(int year){
        if (year%4==0){
            System.out.println(year+" is leaf");
        }else {
            System.out.println(year+" is not leaf");
        }
    }
    public static void Numcheker(int num){

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        checkVovel('v');
        checkleafyear(20);
    }
}
