package exercises.technology.main;

public class Computer {

    private static int nextComputerId = 1;
    private int id;
    private String os;
    private int ram;
    private double hdd;
    private String owner;

    public int getId() { return this.id; }
    public String getOs() { return this.os; }
    public int getRam() { return this.ram; }
    public double getHdd() { return this.hdd; }
    public void setOwner(String owner) {this.owner = owner;}

    public Computer(String os, int ram, double hdd) {
        this.id = nextComputerId;
        nextComputerId ++;
        this.os = os;
        this.ram = ram;
        this.hdd = hdd;
    }

    public String computerGreeting() {
        return "Hello. My ID is " + this.id + " and my operating system is " + this.os + ". I have " + this.ram + " GBs of RAM and a hard drive of " + this.hdd + " GBs.";
    }






}
