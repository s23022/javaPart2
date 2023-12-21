package chapter13_2;

import java.util.List;

public class Sample4 {
    public static void main(String[] args) {
        var list = List.of("apple", "peach", "watermelon", "banana");
        list.stream()
                .takeWhile(e->e.charAt(0)!='w')
                .forEach(e->System.out.print(e + " "));
    }
}
//例は、先頭文字が「'w'」ではない、という条件なので、"apple", "peach"はストリームに送り出され、"watermelon"以降は捨てられます。
