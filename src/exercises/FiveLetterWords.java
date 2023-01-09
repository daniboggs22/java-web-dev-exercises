package exercises;

import java.util.ArrayList;
import java.util.Scanner;

//import java.util.Arrays;
//import java.util.List;

public class FiveLetterWords {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        List<String> wordList = Arrays.asList("giant", "troll", "in", "the", "dungeon");
//        ArrayList<String> words = new ArrayList<>(wordList);
        ArrayList<String> words = new ArrayList<>();
        words.add("giant");
        words.add("troll");
        words.add("in");
        words.add("the");
        words.add("dungeon");




        //go to list, filter out which words have a length of 5, print those
//        for(String word: words){
//            if(word.length()== 5){
//                System.out.println(word);
//            }
//
//        }
//Let the user enter how many letters to search for
        System.out.println("Enter how many letters to search for: ");
        int searchNumber = input.nextInt();
        for(String word: words){
            if(word.length() == searchNumber){
                System.out.println(word);
            }
        }
    }
}
