package exercises;

import java.util.Scanner;

public class MilesPerGallon {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("How miles did you drive?");

        double milesDriven = input.nextDouble();

        System.out.println("How many gallons did you use?");

        double gallonsUsed = input.nextDouble();

        double mPG = milesDriven / gallonsUsed;

        System.out.println("You're miles per gallon is " + mPG + ".");

    }
}
