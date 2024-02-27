package Test2;

public class sample1 {
    public static void main(String[] args) {

        Drink drink = new Drink();
        drink.order("EXTRASMALL");

        Drink drink2 = new Drink();
        drink2.order2(Size.LARGE);
    }
}

class Drink{
//    public static final String SMALL = "SMALL";
//    public static final String MEDIUM = "MEDIUM";
//    public static final String LARGE = "LARGE";
//    public static final String EXTRALARGE = "EXTRALARGE";
    void order(String size){
        System.out.println(size + "が注文されました");
    }

    void order2(Size size){
        System.out.println(size.name() + "が注文されました");
    }
}

enum Size{
    SMALL,
    MEDIUM,
    LARGE,
    EXTRALARGE
}