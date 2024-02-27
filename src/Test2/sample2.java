package Test2;

public class sample2 {
    public static void main(String[] args) {
        Season sp = Season.SPRING;
        System.out.println(sp.name());
        System.out.println(sp.ordinal());
    }
}

enum Season{
    SPRING,
    SUMMER,
    FALL,
    WINTER
}
