package practise_4.task_2;

public class Main {
    public static void main(String[] args) {

        // ВАРИАНТ 2

        Calculator calc = new Calculator();
        System.out.println("12 + 3 = " + calc.sum(12, 3));
        System.out.println("12 - 3 = " + calc.sub(12, 3));
        System.out.println("12 * 3 = " + calc.mul(12, 3));
        System.out.println("12 / 3 = " + calc.div(12, 3));
        System.out.println("12 % 3 = " + calc.mod(12, 3));
        System.out.println("14 % 3 = " + calc.mod(14, 3));
    }
}
