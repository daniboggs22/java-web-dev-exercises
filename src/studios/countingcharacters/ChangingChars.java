package studios.countingcharacters;

import java.util.HashMap;
import java.util.Map;

public class ChangingChars {
    public static void main(String[] args) {
        String sentence = "If the product of two terms is zero then common sense says " +
                "at least one of the two terms has to be zero to start with. " +
                "So if you move all the terms over to one side, " +
                "you can put the quadratics into a form that can be " +
                "factored allowing that side of the equation to equal zero. " +
                "Once you’ve done that, it’s pretty straightforward from there.";
        //convert to chars
        char[] charactersInString = sentence.toCharArray();
        //initialize HashMap
        HashMap<Character, Integer> sentenceChar = new HashMap<>();

        //loop through and count
        for(char character: charactersInString) {
            if(sentenceChar.containsKey(character)){
                sentenceChar.put(character, sentenceChar.get(character) +1);

            } else {
                sentenceChar.put(character, 1);
            }
        }
        for(Map.Entry<Character, Integer> character: sentenceChar.entrySet()) {
            System.out.println(character.getKey() + ": " + character.getValue());
        }

        System.out.println(sentenceChar);
    }
}
