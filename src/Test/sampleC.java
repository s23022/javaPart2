package Test;

public class sampleC implements PaymentStrategy{
    @Override
    public void processPayment() {
        System.out.println("現金を入れてください");
    }
}
