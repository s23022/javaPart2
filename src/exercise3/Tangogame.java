package exercise3;

import java.util.Scanner;
import java.util.Random;

public class Tangogame {

    //単語のリスト
    private static final String[] WORDS = {"apple", "banana", "orange", "grape", "kiwi"};
    // 最大試行回数
    private static final int MAX_ATTEMPTS = 5;

    public static void main(String[] args) {
        playGame(); // ゲームメソッドを呼び出してゲームを開始
    }

    //　ゲームのメインロジック
    static void playGame() {
        Scanner scanner = new Scanner(System.in); // ユーザーの入力を受け取るScannerオブジェクト
        Random random = new Random();// ランダムな単語を選ぶためのRandomオブジェクト
        int attempts = 0; // ユーザーの試行回数

        // 単語リストからランダムに単語を選択
        String answer = WORDS[random.nextInt(WORDS.length)];
        //　現在の単語を表示するための変数を初期化
        StringBuilder guessedWord = new StringBuilder(answer.replaceAll(".", "？")); // "?" で初期化

        //ゲーム開始のメッセージ
        System.out.println("単語当てゲームへようこそ！");

        //ゲームのループ
        while (attempts < MAX_ATTEMPTS) {
            //　出題された単語の数を表示
            System.out.println("ヒント単語の数: " + guessedWord);
            // 入力する
            System.out.print("入力してください: ");
            String guess = scanner.nextLine();

            //入力した単語が正しいかチェック
            if (isCorrect(guess, answer)) {
                // 正解の場合
                System.out.println("おめでとうございます！正解です。ゲームクリア！");
                return; // ゲーム終了
            } else {
                //不正解の場合
                attempts++;
                System.out.println("不正解です。残りの試行回数: " + (MAX_ATTEMPTS - attempts));
            }
        }

        //ゲームオーバーのメッセージ
        System.out.println("ゲームオーバー！正解は: " + answer);
    }

    // 入力した単語が正しいかどうか判定するメソッド
    static boolean isCorrect(String guess, String answer) {
        if (guess.equalsIgnoreCase(answer)) {
            return true; // 入力した単語が正しい場合はtrueを返す
        } else {
            System.out.println("不正解です。もう一度試してください！");
            return false; // 入力した単語が正しくない場合はfalseを返す
        }
    }
}
/*
コード内で使われている主な操作についての説明

1. WORDS[random.nextInt(WORDS.length)]:
WORDS.length は WORDS 配列の要素数を取得します。
random.nextInt(WORDS.length) は、0 から WORDS.length - 1 の範囲内でランダムな整数を生成します。
これにより、WORDS 配列からランダムに単語が選択されます。

2. guessedWord = new StringBuilder(answer.replaceAll(".", "？"));:
answer.replaceAll(".", "？") は answer の各文字を "？" で置き換えます。
これにより、当てるべき単語が "？" で隠された形になります。
new StringBuilder(...) は、生成された文字列を StringBuilder オブジェクトに変換します。
これにより、文字列を効率的に操作できます。

3. System.out.println("現在の単語: " + guessedWord);:
System.out.println はコンソールにテキストを表示するためのメソッドです。
"現在の単語: " + guessedWord は文字列結合を行い、現在の単語を表示します。

4. String guess = scanner.nextLine();:
scanner.nextLine() はユーザーが入力した文字列を取得します。
これにより、ユーザーが予想した単語が得られます。

5.attempts++;:
attempts 変数の値を1増やします。
これにより、ユーザーの試行回数がトラッキングされます。

6. isCorrect(guess, answer):
ユーザーの予想が正しいかどうかを判定するメソッドです。
guess が answer と等しい場合、正解として true を返します。

7. System.out.println("ゲームオーバー！正解は: " + answer);:
ゲーム終了時に、正解を含むメッセージをコンソールに表示します。

これらの操作は、ユーザーとの対話やゲーム進行を管理するために使用されています。
 */