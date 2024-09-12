package practise_2;

public class Car {
    private String model;
    private String license;
    private String color;
    private int year;

    final private int current_year = 2024;

    public Car(String model, String license, String color, int year) {
        this.model = model;
        this.license = license;
        this.color = color;
        this.year = year;
    }

    public Car() {
        this.model = "Tesla";
        this.license = "B";
        this.color = "silver";
        this.year = 2024;
    }

    public Car(String model) {
        this.model = model;
        this.license = "B";
        this.color = "silver";
        this.year = 2024;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", license='" + license + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year +
                '}';
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getLicense() {
        return license;
    }

    public void setLicense(String license) {
        this.license = license;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int age() {
        int a = this.current_year - this.year;
        if (a < 0) {
            return 0;
        }
        return a;
    }
}
