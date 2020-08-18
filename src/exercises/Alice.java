package exercises;

import java.util.Scanner;

public class Alice {

    public static void main(String[] args) {

        String firstSentence = "Alice was beginning to get very tired of sitting by her sister on the bank, and of having nothing to do: once or twice she had peeped into the book her sister was reading, but it had no pictures or conversations in it, 'and what is the use of a book,' thought Alice 'without pictures or conversation?'";
        String firstSentenceMod;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a term.");

        String searchTerm = input.nextLine().toLowerCase();

        if (firstSentence.toLowerCase().contains(searchTerm)) {
            System.out.println("The term '" + searchTerm + "' is in the first sentence of Alice in Wonderland.");
            int index = firstSentence.toLowerCase().indexOf(searchTerm.toLowerCase());

            System.out.println(searchTerm.length());
            firstSentenceMod = firstSentence.toLowerCase().replace(searchTerm.toLowerCase(), "");
            System.out.println(firstSentenceMod);

            String firstPart = firstSentence.substring(0, index);
            String secondPart = firstSentence.substring(index + searchTerm.length());

            System.out.println(firstPart + secondPart);


        } else {
            System.out.println("That term is not in the sentence.");
        }

        input.close();


    }
}
