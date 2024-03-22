package Test4;

import java.util.Random;
import java.util.Scanner;

// 問題生成および採点を担当するクラス
class MultiplicationQuiz {
    private final int numberOfQuestions;
    private final int maxOperand;
    private final Random random;
    private final Scanner scanner;

    // コンストラクタ
    public MultiplicationQuiz(int numberOfQuestions, int maxOperand) {
        this.numberOfQuestions = numberOfQuestions;
        this.maxOperand = maxOperand;
        this.random = new Random();
        this.scanner = new Scanner(System.in);
    }

    // 掛け算の問題を出題し、ユーザーの回答を受け取り、採点するメソッド
    public void startQuiz() {
        int score = 0;
        for (int i = 0; i < numberOfQuestions; i++) {
            int num1 = random.nextInt(maxOperand) + 1;
            int num2 = random.nextInt(maxOperand) + 1;
            int correctAnswer = num1 * num2;

            System.out.print("問題" + (i + 1) + ": " + num1 + " × " + num2 + " = ");
            int userAnswer = scanner.nextInt();

            if (userAnswer == correctAnswer) {
                System.out.println("正解！");
                score++;
            } else {
                System.out.println("不正解！正解は " + correctAnswer + " です。");
            }
        }
        System.out.println("あなたのスコアは " + score + " / " + numberOfQuestions + " です。");
    }
}

public class sample1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 問題数と最大の被乗数を設定
        System.out.print("受ける問題数を入力してください: ");
        int numberOfQuestions = scanner.nextInt();

        System.out.print("入力した数字内での計算を出題します。数字を入力してください: ");
        int maxOperand = scanner.nextInt();

        // 掛け算のクイズを生成して開始
        MultiplicationQuiz quiz = new MultiplicationQuiz(numberOfQuestions, maxOperand);
        quiz.startQuiz();

        // 終了処理
        scanner.close();
    }
}
