import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {
        final double ROUBLES_PER_YUAN = 11.91; // курс покупки
        int yuan; // сумма денег в китайских юанях
        int roubles; // сумма денег в российских рублях

        Scanner in = new Scanner(System.in);

        System.out.print("Введите сумму в китайских юанях: ");
        yuan = in.nextInt();

        roubles = (int) Math.ceil(ROUBLES_PER_YUAN * yuan);

        System.out.println("Сумма в российских рублях: " + roubles);
    }
}