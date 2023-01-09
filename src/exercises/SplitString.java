package exercises;
import java.util.Arrays;
public class SplitString {
    public static void main(String[] args) {
        String suessString = "I would not, could not, in a box. I would not, could not with a fox. " +
                "I will not eat them in a house. I will not eat them with a mouse.";
//split the string by spaces and print
//        String[] newString = suessString.split(" ");
//        System.out.println(newString[1]);
//        System.out.println(Arrays.toString(newString));

        //split the string by sentences and print
        String[] suessSentence = suessString.split("\\.");
        System.out.println(Arrays.toString(suessSentence));
    }
}
