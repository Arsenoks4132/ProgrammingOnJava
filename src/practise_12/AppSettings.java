package practise_12;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class AppSettings {
    private static AppSettings instance;

    private Map<String, String> settings;

    private AppSettings() {
        settings = new ConcurrentHashMap<>();
    }

    public static AppSettings getInstance() {
        if (instance == null) {
            instance = new AppSettings();
        }
        return instance;
    }

    public void setSetting(String key, String value) {
        settings.put(key, value);
    }

    public String getSetting(String key) {
        return settings.get(key);
    }
}