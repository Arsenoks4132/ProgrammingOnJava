package practise_10;

public class A {
    protected int x;

    public A(int x) {
        this.x = x;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void displayLength() {
        System.out.println("Длина радиус вектора до объекта класса точки на прямой A: " + x);
    }
}
