package exercises;

import java.util.Scanner;

public class Alice {
    public static void main(String[] arg) {
        Scanner input = new Scanner(System.in);
        String alice = "Alice was beginning to get very tired of sitting by her sister on the bank, " +
                "and of having nothing to do: once or twice she had peeped into the book her sister was " +
                "reading, but it had no pictures or conversations in it, 'and what is the use of a book,'" +
                " thought Alice 'without pictures or conversation?'";
        String newAlice = alice.toLowerCase();

        System.out.println("Enter a word to search for: ");
        String searchWord = input.nextLine().toLowerCase();

        input.close();
        int index = newAlice.indexOf(searchWord);
        int length = searchWord.length();

        String modifiedSentence = newAlice.replace(searchWord,"");
        System.out.println(modifiedSentence);


        if (newAlice.contains(searchWord)) {
            System.out.println("The word " + searchWord + " is contained in the sentence at index " + index + "." +
                    " It has a length of " + length + ".");
        } else {

            System.out.println("The word " + searchWord + " is not contained in the sentence.");
        }


    }
}