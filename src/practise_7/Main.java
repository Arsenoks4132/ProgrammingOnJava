// Вариант 2

package practise_7;

import middle.middle_counter;

import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (true) {
            int num = in.nextInt();
            if (num < 0) {
                break;
            }
            System.out.println(num + "-е число Фибоначчи: " + middle_counter.fibb(num));
        }
    }
}
