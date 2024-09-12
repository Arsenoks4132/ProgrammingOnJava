package practise_2;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        System.out.println(car);

        Car bmw = new Car("BMW", "R", "White", 2020);
        System.out.println(bmw);

        Car porshe = new Car("porshe");
        System.out.println(porshe);

        System.out.println(car.age());
        System.out.println(bmw.age());
        System.out.println(porshe.age());
    }
}
