package practise_13;

public class Circle {
    private String color;
    private int x;
    private int y;

    public Circle(String color) {
        this.color = color;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void draw() {
        System.out.println("Нарисован " + color + " круг с центром в точке (" + x + ", " + y + ")");
    }
}
