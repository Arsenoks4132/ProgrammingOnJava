package practise_5;



public class Main {

    public static int fibonacci(String[] arr, int index) {
        if (index <= 0) {
            return 0;
        }
        if (index == 1) {
            return 1;
        }
        return fibonacci(arr, index - 1) + fibonacci(arr, index - 2);
    }
    public static void main(String[] args) {
        String[] arr = new String[20];
        for (int i = 0; i < arr.length; ++i) {
            System.out.println(fibonacci(arr, i));
        }
    }
}
