package chapter10_1;

import java.time.LocalDate;

public class Sample2 {
    public static void main(String[] args) {

        Attendable at1 =
                new Student(10, "田中博", "tanaka@mail.jp", 2, LocalDate.of(2000, 1, 1));

        Attendable at2 =
                new AuditingStudent(20, "木村建", "kimura@mail.jp", 3, 112);
    }
}
