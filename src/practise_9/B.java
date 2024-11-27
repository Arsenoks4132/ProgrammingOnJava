package practise_9;

import static java.lang.Math.sqrt;

public class B extends A {
    protected int y;
    protected String name;

    public B(int x, int y, String name) {
        super(x);
        this.y = y;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public void displayLength() {
        System.out.println("Длина радиус вектора до объекта " + name + " класса точки на плоскости B: " + sqrt(x * x + y * y));
    }
}
