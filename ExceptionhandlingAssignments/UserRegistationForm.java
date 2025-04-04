package ExceptionhandlingAssignments;

import java.io.ObjectInputValidation;
import java.util.Scanner;

public class UserRegistationForm {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
        System.out.println("Enter the UserName");
        String username= sc.nextLine();
        System.out.println("Enter the Password:");
        String password=sc.nextLine();
//        try {
//            if (password.length()<=6){
//                System.out.println("Password saved successfully..");
//            }else {
//                //throw ObjectInputValidation("enter valid password");
//            }
//        }
    }
}
