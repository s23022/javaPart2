package chapter13_2;

import java.util.List;

public class Sample3 {
    public static void main(String[] args) {
        var list = List.of("apple", "peach", "watermelon", "banana");
        list.stream()
                .dropWhile(e->e.charAt(0)!='w') // 一文字目が’ｗ’でない間要素を捨てる
                .forEach(e->System.out.print(e + " "));
    }
    //例は、先頭文字が「'w'」でない、という条件なので、"apple", "peach"は捨てられ、"watermelon"以降はストリームに送り出されます。
}
