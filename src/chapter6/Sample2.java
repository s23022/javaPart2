package chapter6;

public class Sample2 {
    public static void main(String[] args) {
        Tax tax = new Tax(100, "田中宏", 300000, 100000);
        tax.setKoujo(120000);

        System.out.println("控除額=" + tax.getKoujo());

        System.out.println("所得を上回る控除額を設定");
        tax.setKoujo(400000);
        System.out.println("控除額=" + tax.getKoujo());
        System.out.println("所得税=" + tax.zeigaku());

        System.out.println("控除額を下回る所得額を設定");
        tax.setShotoku(250000);
        System.out.println("控除額=" + tax.getKoujo());
        System.out.println("所得税=" + tax.zeigaku());
    }
}
