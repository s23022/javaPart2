package Test;

public class sampleA implements PaymentStrategy{
    @Override
    public void processPayment(){
        System.out.println("クレジットカードの番号を入力してください");
    }
}
