package exercise;

import java.time.LocalDate;

public class SeniaMember extends Member{
    private LocalDate birthday;

    public SeniaMember(long id, String name, LocalDate birthday) {
        super(id, name);
        this.birthday = birthday;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    @Override
    public int fee() {
        return 700;
    }
}
