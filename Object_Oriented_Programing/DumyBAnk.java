package Object_Oriented_Programing;

import java.util.Scanner;

public class DumyBAnk {
    public static void main(String[] args) {
        BankAccount myAcc=new BankAccount();
        myAcc.username="TejasPatil";
        myAcc.setPassword("tejas@123");
    }
}
class BankAccount{
    public String username;
    private String password;

    public void setPassword(String pwd) {
        password=pwd;
    }
}
