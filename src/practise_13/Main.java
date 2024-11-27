package practise_13;

public class Main {
    public static void main(String[] args) {

        for (int i = 0; i < 20; ++i) {
            Circle circle = CircleFactory.getCircle(getRandomColor());
            circle.setX(getRandomCoordinate());
            circle.setY(getRandomCoordinate());
            circle.draw();
        }
    }

    private static final String[] colors = {"Красный", "Синий", "Зеленый", "Белый", "Желтый", "Оранжевый"};

    private static String getRandomColor() {
        return colors[(int) (Math.random() * colors.length)];
    }

    private static int getRandomCoordinate() {
        return (int) ((Math.random() - 0.5) * 200);
    }
}
