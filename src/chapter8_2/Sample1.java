package chapter8_2;

public class Sample1 {
    public static void main(String[] args) {
        var lesson = new Lesson("G101", "ゴルフ");
        var gm = new GeneralMember(100, "田中宏", lesson);

      //  System.out.println(gm.getLesson().getLessonName());
        System.out.println("会員名=" +gm.getName());
        System.out.println("受講しているレッスン" + gm.getLessonName());
        System.out.println("レッスン料金=" + gm.fee());
    }
}
