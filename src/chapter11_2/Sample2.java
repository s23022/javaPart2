package chapter11_2;

import java.util.List;
import java.util.function.Predicate;
public class Sample2 {
    public static void main(String[] args) {
        testApple(a -> a.weight()>=300);
    }
    public static void testApple(Predicate<Apple> p) {
        var list = getAppleList();
        for (Apple apple : list) {
            if (p.test(apple)) {
                System.out.println(apple);
            }
        }
    }