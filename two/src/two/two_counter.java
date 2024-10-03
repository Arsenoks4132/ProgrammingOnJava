package two;

public class two_counter {
    public static int fib_two(int n) {
        return fibbonaci(n - 2);
    }

    public static int fibbonaci(int n) {
        if (n > 1) {
            return fibbonaci(n - 1) + fibbonaci(n - 2);
        }
        return n;
    }
}