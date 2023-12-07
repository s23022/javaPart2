package chapter11_2;
import java.util.function.Function;


public class FunExample {
    public static void main(String[] args) {
        //Functionインターフェースのapplyメソッドを使い
        //引数の文字列の長さを返す処理を入れる
        //Function<String, Integer>　f = s -> s.lenght();
//        Function<String, Integer> f = String::length;
//        System.out.println(f.apply("hello"));

        //Functionインターフェースのapplyメソッドを使う
        // 引数の数値（整数）を2.0で割る（少数）
        Function<Integer, Double> f = a -> a / 2.0;
        System.out.println(f.apply(10));

    }
}
