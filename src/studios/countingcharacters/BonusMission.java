package studios.countingcharacters;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class BonusMission {
    public static void main(String[] args) {

        //take user input for a sentence
        Scanner input = new Scanner(System.in);

//assign variable for the user input
        System.out.println("Enter a string to count it's characters: ");
        String userString = input.nextLine();
        //make user input case-insensitive


        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        char[] charAlphabet = alphabet.toCharArray();

        //convert string to character array to easily look through them
        char[] charInUserString = userString.toUpperCase().toCharArray();
        //initialize HashMap to add the values to
        HashMap<Character, Integer> userMap = new HashMap<>();
//for loop to go through each character in the character array and count them
        for (char character : charInUserString) {
//only count alphabetic characters
            if (alphabet.indexOf(character) >= 0) {
                //if the HashMap already contains the letter, we just want to add one to it to up the count
                if (userMap.containsKey(character)) {
                    userMap.put(character, userMap.get(character) + 1);
// if the HashMap does not contain the letter already, we want to add that letter and 1 to initialize the count
                } else {
                    userMap.put(character, 1);
                }
            }
        }
                //refigure the output of HashMap to make it more readable by accessing the key and values
                for (Map.Entry<Character, Integer> letter : userMap.entrySet()) {
                    System.out.println(letter.getKey() + ": " + letter.getValue());
                }

            //System.out.println(userMap);

    }


}