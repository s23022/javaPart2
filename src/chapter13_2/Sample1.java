package chapter13_2;
import java.util.List;
public class Sample1 {
    public static void main(String[] args) {
        var list = List.of("apple", "peach", "grape", "apple", "banana", "peach");
        list.stream()
                .distinct()
                .sorted()
                .forEach(System.out::println);
    }
}
