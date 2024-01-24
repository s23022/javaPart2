package exercise3;

import java.util.Scanner;

public class Test3 {

    public static void main(String[] args) {
        // 標準入力で取得した数値が
        // 10より大きいとき-1
        // 10より小さい時1
        // 10と等しいいとき0
        // を戻り値で返すメソッドを作る
        // 引数は、標準入力で取得した値
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        // メソッドを呼び出して結果を表示
        int result = compareWithTen(num);
        System.out.println(result);
    }

    // メソッド
    static int compareWithTen(int value) {
        if (value > 10) {
            return -1;
        } else if (value < 10) {
            return 1;
        } else {
            return 0;
        }
    }
}
