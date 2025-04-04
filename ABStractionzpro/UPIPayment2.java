package ABStractionzpro;

public class UPIPayment2 implements Payment{

    @Override
    public void makePayment(double amount) {
        System.out.println("Payment ru using UPI Card");
    }
}
