package chapter13_2;

import java.util.List;

public class Sample5 {
    public static void main(String[] args) {
        var list = List.of("apple", "peach", "watermelon", "banana");
        int total = list.stream()
                .mapToInt(String::length) // int型の文字列の長さに変換 ①
                .sum(); // 合計を返す終端操作　②
                System.out.println("総数字数=" + total);

    }
}
// ①では、英単語をint型の値（文字数）に変換し、IntStreamに送り出します。
// ②のsum()メソッドは、IntStreamで使える終端操作です。ストリームを流れてくる値の合計を計算します。
// 下線で示すよううに、式全体が変数totalへの代入式になっているので、合計の値をtotalに取得することができます。