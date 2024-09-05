import java.util.Scanner;

public class Task_2 {
    public static void main(String[] args) {
        final double ROUBLES_PER_YUAN = 11.91; // курс покупки
        int yuan; // сумма денег в китайских юанях
        int roubles; // сумма денег в российских рублях
        String ending = "китайский юань";

        Scanner in = new Scanner(System.in);

        System.out.print("Введите сумму в китайских юанях: ");

        yuan = in.nextInt();

        roubles = (int) Math.ceil(ROUBLES_PER_YUAN * yuan);

        if (yuan % 10 >= 5 || yuan % 10 == 0 || yuan % 100 > 10 && yuan % 100 <= 14) {
            ending = "китайских юаней";
        } else if (yuan % 10 >= 2 && yuan % 10 <= 4) {
            ending = "китайских юяня";
        }
        System.out.println("Вы ввели " + yuan + " " + ending + ", в российских рублях это: " + roubles);
    }
}
