package exercise3;

public class Main {
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        dog1.size = 30;
        dog1.name = "犬１";
        dog1.bark();

        Dog dog2 = new Dog();
        dog2.size = 20;
        dog2.name = "犬２";
        dog2.bark();

        Dog dog3 = new Dog();
        dog3.size = 10;
        dog3.name = "犬３";
        dog3.bark();

        int[] data = new int [3];
        data[0] = 10;

        Dog[] dogs = new Dog[3];
        dogs[0] = dog1;
        dogs[1] = dog2;
        dogs[2] = dog3;

        for(Dog d : dogs){
            d.bark();
        }
    }
}
