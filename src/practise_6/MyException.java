package practise_6;

public class MyException extends Exception {
    private String fio;
    public String getFio() {
        return fio;
    }
    public MyException(String message, String fio) {
        super(message);
        this.fio = fio;
    }
}
