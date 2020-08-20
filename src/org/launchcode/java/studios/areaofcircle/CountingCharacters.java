package org.launchcode.java.studios.areaofcircle;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountingCharacters {

    public static void main(String[] args) {

        HashMap<Character, Integer> countingChar = new HashMap<>();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a phrase to test: ");
        String test = input.nextLine();
        String lowerCaseTest = test.toLowerCase();

        char[] charsInString = lowerCaseTest.toCharArray();

        for (char letter: charsInString) {
            if (countingChar.containsKey(letter)) {
                countingChar.put(letter, countingChar.get(letter) + 1);
            } else {
                countingChar.put(letter, 1);
            }
        }

        for (Map.Entry<Character, Integer> oneChar : countingChar.entrySet()) {
            System.out.println(oneChar.getKey() + ": " + oneChar.getValue());
        }

    }
}
