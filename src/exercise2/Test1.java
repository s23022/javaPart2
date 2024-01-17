package exercise2;

public class Test1 {
    public static void main(String[] args) {

        hello();

        Test1 t = new Test1();
        t.hello2();

        Car c = new Car();
        c.accelerate();;
        c.show();


    }

    public static void hello(){
        System.out.println("hello");
    }

    public void hello2(){
        System.out.println("こんにちは");
    }
}
