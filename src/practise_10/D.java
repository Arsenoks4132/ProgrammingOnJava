package practise_10;

import static java.lang.Math.sqrt;

public class D extends B {
    protected int z;

    public D(int x, int y, int z) {
        super(x, y);
        this.z = z;
    }

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }

    @Override
    public void displayLength() {
        System.out.println("Длина радиус вектора до объекта класса точки в пространстве D: " + sqrt(x * x + y * y + z * z));
    }
}
