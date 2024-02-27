package sample1;

import java.util.Scanner;

public class Tangogame {
    private static final int MAX_ATTEMPTS = 5;
    private String[] words;
    private String answer;
    private StringBuilder currentGuess;
    private int attemptsLeft;

    public Tangogame(String[] words) {
        this.words = words;
    }

    public void play() {
        for (String word : words) {
            playGame(word);
            if (attemptsLeft <= 0) {
                System.out.println("挑戦回数を超えました。ゲームオーバーです。");
                break;
            }
        }
    }

    private void playGame(String answer) {
        this.answer = answer.toLowerCase();
        this.currentGuess = new StringBuilder("_".repeat(answer.length()));
        this.attemptsLeft = MAX_ATTEMPTS;

        Scanner scanner = new Scanner(System.in);
        while (attemptsLeft > 0 && currentGuess.indexOf("_") != -1) {
            System.out.println("現在判明している文字: " + currentGuess);
            System.out.println("残りの回数: " + attemptsLeft);
            System.out.print("アルファベットを入力してください: ");
            String input = scanner.nextLine().toLowerCase();
            if (input.length() != 1 || !Character.isLetter(input.charAt(0))) {
                System.out.println("位置文字のアルファベットを入力してください.");
                continue;
            }
            char guessedLetter = input.charAt(0);
            if (updateCurrentGuess(guessedLetter)) {
                System.out.println("正解");
            } else {
                System.out.println("不正解");
                attemptsLeft--;
            }
        }
        if (currentGuess.indexOf("_") == -1) {
            System.out.println("おめでとうございます、答えは: " + answer);
        } else {
            System.out.println("ゲームオーバー、答えは: " + answer);
        }
    }

    private boolean updateCurrentGuess(char guessedLetter) {
        boolean correctGuess = false;
        for (int i = 0; i < answer.length(); i++) {
            if (answer.charAt(i) == guessedLetter) {
                currentGuess.setCharAt(i, guessedLetter);
                correctGuess = true;
            }
        }
        return correctGuess;
    }

    public static void main(String[] args) {
        String[] words = {"banana", "apple", "orange", "grape", "strawberry"};
        Tangogame game = new Tangogame(words);
        game.play();
    }
}

