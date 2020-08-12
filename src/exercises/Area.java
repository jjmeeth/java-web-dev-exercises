package exercises;

import java.util.Scanner;

public class Area {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter rectangle length: ");

        int length = input.nextInt();

        System.out.println("Enter rectangle width: ");

        int width = input.nextInt();

        int area = length * width;

        System.out.println("The area of the rectangle is " + area + ".");


    }
}
