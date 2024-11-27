package practise_12;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        String[] keys_1 = {"Lang", "Theme", "Color"};
        String[] values_1 = {"Rus", "Dark", "White"};
        Thread thread_1 = new TestSingleton(keys_1, values_1);

        String[] keys_2 = {"Name", "Theme"};
        String[] values_2 = {"Cool", "Light"};
        Thread thread_2 = new TestSingleton(keys_2, values_2);

        thread_1.start();
        thread_2.start();

        thread_1.join();
        thread_2.join();

        String[] keys = {"Lang", "Theme", "Color", "Name"};

        AppSettings app = AppSettings.getInstance();

        for (String key : keys) {
            System.out.println(key + ": " + app.getSetting(key));
        }
    }
}
