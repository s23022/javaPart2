package Test3;

import java.util.Random;
import java.util.Scanner;

// ゲームのメインクラス
public class sample1 {
    public static void main(String[] args) {
        // ゲームの開始
        System.out.println("マリオの世界へようこそ！掛け算ゲームを始めます！");

        // 問題の作成
        MultiplicationGame game = new MultiplicationGame();

        // ゲームの実行
        game.play();

        // ゲームの終了
        System.out.println("ゲーム終了！さようなら！");
    }
}

// 掛け算ゲームクラス
class MultiplicationGame {
    private static final int MAX_RANGE = 10; // 問題の範囲（0からMAX_RANGEまでの乱数を使用）
    private static final int NUM_QUESTIONS = 5; // 問題の数

    // ゲームの実行
    public void play() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int score = 0; // 得点

        // NUM_QUESTIONS回の問題を出題
        for (int i = 1; i <= NUM_QUESTIONS; i++) {
            int num1 = random.nextInt(MAX_RANGE + 1); // 0からMAX_RANGEまでの乱数を生成
            int num2 = random.nextInt(MAX_RANGE + 1); // 0からMAX_RANGEまでの乱数を生成

            // 問題の表示
            System.out.print("問題" + i + ": " + num1 + " × " + num2 + " = ");

            // 解答の入力
            int answer = scanner.nextInt();

            // 正誤判定
            if (answer == num1 * num2) {
                System.out.println("正解！");
                score++; // 得点を増やす
            } else {
                System.out.println("不正解！正解は " + (num1 * num2) + " でした。");
            }
        }

        // ゲーム終了時の得点を表示
        System.out.println("ゲーム終了！あなたの得点は " + score + " / " + NUM_QUESTIONS + " です！");
    }
}
