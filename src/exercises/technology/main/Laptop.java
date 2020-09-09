package exercises.technology.main;

public class Laptop extends Computer {
    private String brand;
    private int screenSize;

    public Laptop(String os, int ram, double hdd, int screenSize, String brand) {
        super(os, ram, hdd);
        this.screenSize = screenSize;
        this.brand = brand;

    }

    public String getBrand() {
        return brand;
    }

    public int getScreenSize() {
        return screenSize;
    }

    public String tellAJoke() {
        return "Did you hear about the monkeys who shared an Amazon account? They were Prime mates.";
    }
}
