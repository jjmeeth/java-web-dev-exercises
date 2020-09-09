package exercises.technology.main;

public class Program {

    public static void main(String[] args) {

        SmartPhone iPhone11 = new SmartPhone("iOS", 6, 128, "Sprint", 4.5);

        System.out.println(iPhone11.computerGreeting());

        Laptop macBook = new Laptop("Catalina", 8, 500, 15, "Apple");

        System.out.println(macBook.tellAJoke());

        System.out.println(macBook.computerGreeting());
    }
}
