package Test;

import java.util.Scanner;
public class sample1 {
    public static void main(String[] args) {
         /*
        標準入力で数値を受け取る

        お支払い方法を選んでください
        １：　クレジットカード
        ２：　電子マネー
        ３：　現金

        下記のメッセージを表示する
        クレジットカード番号を入力してください
        端末にかざしてください
        現金を入れてください
         */
        Scanner sc = new Scanner(System.in);

        PaymentStrategy[] options = new PaymentStrategy[3];
        options[0] = new sampleA();
        options[1] = new sampleB();
        options[2] = new sampleC();


          System.out.println("お支払い方法を選んでください");
//        System.out.println("1: クレジットカード");
//        System.out.println("2: 電子マネー");
//        System.out.println("3: 現金");

        int num = sc.nextInt();

        PaymentProcessor p = new PaymentProcessor(options[num-1]);
        p.pay();

//        if(num == 1) {
//            PaymentProcessor p = new PaymentProcessor(new sampleA());
//            p.pay();
//        } else if (num == 2) {
//            PaymentProcessor p = new PaymentProcessor(new sampleB());
//            p.pay();
//        } else if (num == 3) {
//            PaymentProcessor p = new PaymentProcessor(new sampleC());
//            p.pay();
//        }
        // Paymentprocess p = new Paymentprocess();
        // p.processPayment(num);
    }
}
 class PaymentProcessor {
     PaymentStrategy ps;

     public PaymentProcessor(PaymentStrategy ps) {
         this.ps = ps;
     }

     //支払う
     public void pay() {
         ps.processPayment();
     }
 }



//
//    void processPayment(int num){
//        if(num == 1){
//            System.out.println("クレジットカード番号を入力してください");
//        } else if (num == 2) {
//            System.out.println("端末にかざしてください");
//        } else if (num == 3) {
//            System.out.println("現金を入れてください");
//        }
//    }
