// ВАРИАНТ 5


package practise_6;

import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void check_fio(String fio) throws MyException {
        if (fio.isEmpty()) {
            throw new MyException("Введенная строка пустая", "<empty_input>");
        }

        String[] words = fio.split(" ");
        if (words.length == 1) {
            throw new MyException("Отсутствуют фамилия и отчество", fio);
        }
        if (words.length == 2) {
            throw new MyException("Отсутствует отчество", fio);
        }

        if (words.length > 3) {
            throw new MyException("Введены слова помимо ФИО", fio);
        }

        if (words[0].equals(words[1]) || words[1].equals(words[2]) || words[0].equals(words[2])) {
            throw new MyException("Все слова должны быть попарно различны", fio);
        }

        for (String word : words) {
            if (word.length() < 3) {
                throw new MyException("Все слова должны быть не короче 3-х символов", word);
            }
            if (word.length() > 15) {
                throw new MyException("Все слова должны быть не длиннее 15-и символов", word);
            }
            if (word.charAt(0) > 'Я' || word.charAt(0) < 'А') {
                throw new MyException("Все слова должны начинаться с большой русской буквы", word);
            }
            for (int j = 1; j < word.length(); ++j) {
                if (word.charAt(j) > 'я' || word.charAt(j) < 'а') {
                    throw new MyException("Все символы должны быть русскими буквами", word);
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (true) {
            String fio = in.nextLine();
            if (Objects.equals(fio, "exit") || Objects.equals(fio, "quit")) {
                break;
            }
            try {
                check_fio(fio);
            } catch (MyException e) {
                System.out.println(e.getMessage());
                System.out.println(e.getFio());
            }
        }
    }
}