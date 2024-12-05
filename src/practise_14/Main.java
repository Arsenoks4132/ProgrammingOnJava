package practise_14;

public class Main {
    public static void main(String[] args) {
        Observer[] users = {new User("Виталий"), new User("Анатолий"), new User("Иннокентий")};
        Subject shop = new Subject(users);
        shop.event();
    }
}
