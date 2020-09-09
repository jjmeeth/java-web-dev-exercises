package org.launchcode.java.demos.lsn5unittesting.main;

public class Main {

    public static void main(String[] args) {
        Car car = new Car("Toyota", "Prius", 10, 50);
        System.out.println(car.getMake() + " - " + car.getModel());

        System.out.println(car.getGasTankLevel());
        car.drive(50.00);
        System.out.println(car.getGasTankLevel());

        int test = ((int)car.getGasTankLevel());
        System.out.println(test);

    }
}
