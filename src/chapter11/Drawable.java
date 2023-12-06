package chapter11;


interface Drawable {
    public void draw();
}
class Example {
    public static void main(String[] args) {
        Drawable d = new Drawable() {
            @Override
            public void draw() {
                System.out.println("Hello");
            }
        };
        d.draw();
    }
}
