package practise_10;

import static java.lang.Math.sqrt;

public class B extends A {
    protected int y;

    public B(int x, int y) {
        super(x);
        this.y = y;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public void displayLength() {
        System.out.println("Длина радиус вектора до объекта класса точки на плоскости B: " + sqrt(x * x + y * y));
    }
}
