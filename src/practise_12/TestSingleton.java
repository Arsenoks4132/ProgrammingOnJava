package practise_12;

public class TestSingleton extends Thread {
    private String[] keys;
    private String[] values;
    private AppSettings app;

    TestSingleton(String[] keys, String[] values) {
        this.keys = keys;
        this.values = values;
        app = AppSettings.getInstance();
    }

    @Override
    public void run() {
        for (int i = 0; i < keys.length; ++i) {
            app.setSetting(keys[i], values[i]);
        }
    }
}
