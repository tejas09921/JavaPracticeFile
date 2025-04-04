//package BankingApp;
//
//import java.util.Scanner;
//
//public class BankingApplication {
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter costemer ID: ");
//        String custID= sc.nextLine();
//        System.out.println("Enter Costemer name : ");
//        String custName= sc.next();
//
//        System.out.println("Choose loan type:");
//        System.out.println("1.Home Loan");
//        System.out.println("2.Car Loan");
//
//        int choice= sc.nextInt();
//        Costomer customer=null;
//
//        if (choice==1){
//            HomeLoan hm=new HomeLoan(custID,custName);
//        } else if (choice==2) {
//            CarLoan c1=new CarLoan(custID,custName);
//        }else {
//            System.out.println("INvalid choice");
//        }
//        System.out.println("Enter Loan Amount: ");
//        double loanAmount= sc.nextDouble();
//
//        customer.applyloan(loanAmount);
//        customer.displayCostomerDeteil();
//        customer.checkstatus();
//
//
//    }
//}
