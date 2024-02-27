package exercise4;

class Dog {
    void eat() {
        System.out.println("犬が餌をだべる");
    }
}

class Cat {
    void eat() {
        System.out.println("猫が餌を食べる");
    }
}

public class sample1 {
    // feedメソッドを作る
    // DogクラスのeatメソッドとCatクラスのeatメソッドを呼び出す
    public static void feed() {
        Dog dog = new Dog();
        Cat cat = new Cat();

        dog.eat();
        cat.eat();
    }

    public static void main(String[] args) {
        // 実行結果
        // 犬が餌をだべる
        // 猫が餌を食べる
        feed();
    }
}
