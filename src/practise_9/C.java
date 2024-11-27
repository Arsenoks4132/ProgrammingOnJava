package practise_9;

import static java.lang.Math.sqrt;

public class C extends A {
    protected int y;

    public C(int x, int y) {
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
        System.out.println("Длина радиус вектора до объекта класса точки на плоскости C: " + sqrt(x * x + y * y));
    }
}
