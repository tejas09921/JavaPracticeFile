package ABStractionzpro;

public class CreditCardPayment implements Payment{

    @Override
    public void makePayment(double amount) {
        System.out.println("Paid ru ussing credit card ");
    }
}
