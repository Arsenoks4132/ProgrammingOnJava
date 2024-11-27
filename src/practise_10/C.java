package practise_10;

import static java.lang.Math.sqrt;

public class C extends B {
    protected int z;
    String name;

    public C(int x, int y, int z, String name) {
        super(x, y);
        this.z = z;
        this.name = name;
    }

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void displayLength() {
        System.out.println("Длина радиус вектора до объекта " + name + " класса точки в пространстве C: " + sqrt(x * x + y * y + z * z));
    }
}
