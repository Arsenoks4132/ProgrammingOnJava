package practise_11;

public class Main {
    public static void main(String[] args) {
        MyStack stack = new MyStack();

        stack.push(1);
        stack.push(2);
        System.out.println(stack.top());
        System.out.println(stack.pop());
        System.out.println(stack.empty());
        System.out.println(stack);
    }
}
