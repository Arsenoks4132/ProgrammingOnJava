package practise_10;

import java.util.ArrayList;
import java.util.List;


public class Main {

    static List<A> list;

    public static void main(String[] args) {
        list = new ArrayList<>();

        // Создание точек на прямой

        A a_1 = new A(12);
        A a_2 = new A(10);
        A a_3 = new A(5);

        list.add(a_1);
        list.add(a_2);
        list.add(a_3);

        // Создание точек на плоскости

        B b_1 = new B(15, 6);
        B b_2 = new B(12, 5);
        B b_3 = new B(4, 7);

        list.add(b_1);
        list.add(b_2);
        list.add(b_3);

        // Создание точек в пространстве с именем

        C c_1 = new C(3, 6, 54, "One");
        C c_2 = new C(8, 10, 76, "Two");
        C c_3 = new C(9, 1, 11, "Three");

        list.add(c_1);
        list.add(c_2);
        list.add(c_3);

        // Создание точек в пространстве

        D d_1 = new D(1, 1, 1);
        D d_2 = new D(4, 8, 6);
        D d_3 = new D(1, 2, 3);

        list.add(d_1);
        list.add(d_2);
        list.add(d_3);

        // Создание точек в четырехмерном пространстве

        E e_1 = new E(1, 1, 1, 1);
        E e_2 = new E(4, 8, 7, 87);
        E e_3 = new E(1, 2, 4, 8);

        list.add(e_1);
        list.add(e_2);
        list.add(e_3);

        displayAll();

        displaySpecific(B.class, C.class);
        displayExcept(B.class, C.class);

        displaySpecific(A.class);
        displayExcept(B.class);
    }

    public static void displayAll() {
        System.out.println("Вывод всех объектов:");
        for (A object : list) {
            object.displayLength();
        }
        System.out.println();
    }

    @SafeVarargs
    public static void displaySpecific(Class<? extends A>... types) {
        System.out.println("Вывод определенных объектов:");
        for (A object : list) {
            for (Class<? extends A> type : types) {
                if (object.getClass() == type) {
                    object.displayLength();
                    break;
                }
            }
        }
        System.out.println();
    }

    @SafeVarargs
    public static void displayExcept(Class<? extends A>... types) {
        System.out.println("Вывод объектов, исключая определенные:");
        for (A object : list) {
            boolean is_allowed = true;
            for (Class<? extends A> type : types) {
                if (object.getClass() == type) {
                    is_allowed = false;
                    break;
                }
            }
            if (is_allowed) {
                object.displayLength();
            }
        }
        System.out.println();
    }
}