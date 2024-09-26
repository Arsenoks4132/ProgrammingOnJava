package practise_3.app;

import practise_3.vehicles.*;

public class Main {
    public static void main(String[] args) {
        Car car_1 = new Car("John", 123, "petrol");
        ElectricCar car_2 = new ElectricCar("Mary", 15, 500);
        System.out.println(car_1.getEngineType());
        System.out.println(car_2.getEngineType());

        car_1.setEngineType("water");
        car_2.setEngineType("petrol");

        System.out.println(car_1.getEngineType());
        System.out.println(car_2.getEngineType());

        System.out.println(car_1.getInsuranceNumber());
        System.out.println(car_2.getBatteryCapacity());

        System.out.println(car_1.getOwnerName());
        System.out.println(car_2.getOwnerName());
    }
}
