package practise_8;

import java.util.List;


class FindSimpleDivisors extends Thread {
    private final List<Integer> divisors;
    private final int beginning;
    private final int step;
    private final long num;


    public FindSimpleDivisors(List<Integer> divisors, int beginning, int step, long num) {
        this.divisors = divisors;
        this.beginning = beginning;
        this.step = step;
        this.num = num;
    }

    public static boolean isSimple(int num) {
        if (num <= 1) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    @Override
    public void run() {
        for (int i = beginning; i <= Math.sqrt(num); i += step) {
            if (num % i == 0 && isSimple(i)) {
                synchronized (divisors) {
                    divisors.add(i);
                }
            }
        }
    }
}