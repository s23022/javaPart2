package chapter8_1;

import java.time.LocalDate;

public class LocalDateExamples {
    public static void main(String[] args) {

        LocalDate today = LocalDate.now();
        LocalDate day = LocalDate.of(2022, 12, 1);

        if(today.isAfter(day)) {
            System.out.println(today+"は"+day+"よりも後の日付");
        }else {
            System.out.println(today+"は"+day+"よりも前の日付");
        }
    }
}
