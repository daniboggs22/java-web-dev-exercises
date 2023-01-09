package exercises;

import java.util.Arrays;
import java.util.List;


public class ArrayList {
    public static int main(String[] args) {
        List<Integer> numberList = Arrays.asList(2, 4, 6, 8, 10, 1, 3, 5, 7, 9);
        java.util.ArrayList<Integer> numbers = new ArrayList<>(numberList);

        SumIntegers.sumEven();
    }
}
