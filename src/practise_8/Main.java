package practise_8;

import java.util.*;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Scanner in = new Scanner(System.in);

        while (true) {
            System.out.print("Введите число для исследования: ");
            long num = in.nextLong();
            if (num <= 0) {
                break;
            }

            System.out.print("Введите количество потоков для исследования: ");
            int threads_amount = in.nextInt();
            if (threads_amount < 1 || threads_amount > 10) {
                System.out.println("Неправильное число потоков");
                continue;
            }

            List<Integer> simpleDivisors = Collections.synchronizedList(new ArrayList<>());

            Thread[] threads = new Thread[threads_amount];

            for (int i = 0; i < threads_amount; i++) {
                threads[i] = new FindSimpleDivisors(simpleDivisors, 2 + i, threads_amount, num);
                threads[i].start();
            }

            for (Thread thread : threads) {
                thread.join();
            }

            Collections.sort(simpleDivisors);

            System.out.println("Простые делители числа " + num + ": " + simpleDivisors);
        }
    }

}
