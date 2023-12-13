package chapter12;

public class Mountain {
    private String name;
    private int feet;
    public Mountain(String name, int height) {
        this.name = name;
        this.feet = feet;
    }

    public String getName() {
        return name;
    }

    public int getHeight() {
        return feet;
    }

    @Override
    public String toString() {
        return name + " " + feet;
    }
}
