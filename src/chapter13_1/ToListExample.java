package chapter13_1;

import java.util.Arrays;

public class ToListExample {
    public static void main(String[] args) {

        var list = Arrays.asList("banana", "Orange", "peach", "apple", "pineApple");

        var result = list.stream()
                .filter(e -> e.length()<6)
                .map(e->e.toUpperCase())
                .toList();

        result.forEach(System.out::println);
    }
}
