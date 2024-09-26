package practise_4.task_1;

public class Main {
    public static void main(String[] args) {
        Animal a = new Dog(5, 123);
        Animal b = new Sheep(3, 200);
        a.move();
        b.move();
        System.out.println("Возраст a в человеческих годах: " + a.toHumanAge());
        System.out.println("Возраст b в человеческих годах: " + b.toHumanAge());
    }
}
