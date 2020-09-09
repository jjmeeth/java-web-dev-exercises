package exercises.technology.main;

public class SmartPhone extends Computer {
    private String serviceProvider;
    private double screenSize;

    public SmartPhone(String os, int ram, double hdd, String serviceProvider, double screenSize) {
        super(os, ram, hdd);
        this.serviceProvider = serviceProvider;
        this.screenSize = screenSize;
    }

    public String getServiceProvider() {
        return serviceProvider;
    }

    public void setServiceProvider(String serviceProvider) {
        this.serviceProvider = serviceProvider;
    }

    public double getScreenSize() {
        return screenSize;
    }

    public int countCharacters(String words) {
        return words.length();
    }


}
