package practise_10;

import static java.lang.Math.sqrt;

public class E extends D {
    protected int w;

    public E(int x, int y, int z, int w) {
        super(x, y, z);
        this.w = w;
    }

    @Override
    public void displayLength() {
        System.out.println(
                "Длина радиус вектора до объекта класса точки в четырехмерном пространстве E: " +
                        sqrt(x * x + y * y + z * z + w * w)
        );
    }
}
