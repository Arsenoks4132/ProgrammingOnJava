package practise_14;

public class User implements Observer {
    private String name;

    public User(String name) {
        this.name = name;
    }

    @Override
    public void notify_sub() {
        System.out.println("Пользователь " + name + " уведомлен");
    }
}
