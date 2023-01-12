package exercises;
import java.util.ArrayList;
public class SumIntegers {
    public static int sumEven(ArrayList<Integer> ArrayList) {
        ArrayList<Integer> numbers = new ArrayList<>();
        int sum = 0;
        for (int num : numbers) {
            sum = 0;
            if (num % 2 == 0) {
                sum += num;
            }


        }
        return sum;
    }
}
