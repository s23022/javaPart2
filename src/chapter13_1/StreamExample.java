package chapter13_1;

import java.util.Arrays;
import java.util.List;

public class StreamExample {
    public static void main(String[] args) {

        var list = List.of("banana", "orange", "peach", "apple", "pinapple");

        list.stream()
                .filter(e -> e.length()<6)
                .map(e->e.toUpperCase())
                .forEach(System.out::println);
    }
}
