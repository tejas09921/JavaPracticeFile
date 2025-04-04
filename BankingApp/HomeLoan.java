//package BankingApp;
//
//public class HomeLoan extends Costomer{
//
//    public HomeLoan(String costomerID,String name){
//        super(costomerID,name);
//    }
//
//    @Override
//    public void applyloan(Double amount) {
//        if (amount>500000){
//            this.loanamount=amount;
//            this.loanstatus="Approved";
//            System.out.println(name+"'s loane has been approved of amount"+amount);
//        }else {
//            this.loanstatus="Rejected";
//            System.out.println(name+" 's home loan "+amount+"amount has been rejected");
//        }
//    }
//
//    @Override
//    public void checkstatus() {
//        System.out.println("Loan Status for"+name+":"+loanstatus);
//    }
//}
