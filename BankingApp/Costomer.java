package BankingApp;

public abstract class Costomer implements LoanProcess{
    String costomerID;
    String name;
    double loanamount;

    public Costomer(String costomerID, String name) {
        this.costomerID = costomerID;
        this.name = name;
        this.loanamount = 0.0;
    }



    void displayCostomerDeteil(){
       System.out.println("CostomerId: "+costomerID);
       System.out.println("Name: "+name);

   }


}
