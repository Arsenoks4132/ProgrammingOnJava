package one;

public class one_counter {
    public static int fib_one(int n) {
        return fibbonaci(n - 1);
    }

    public static int fibbonaci(int n) {
        if (n > 1) {
            return fibbonaci(n - 1) + fibbonaci(n - 2);
        }
        return n;
    }
}