package middle;

import one.one_counter;
import two.two_counter;

public class middle_counter {
    public static int fibb(int n) {
        if (n > 1) {
            return one_counter.fib_one(n) + two_counter.fib_two(n);
        }
        return n;
    }
}