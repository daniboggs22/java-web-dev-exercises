package exercises;

import java.util.ArrayList;
//import java.util.List;
//import java.util.Arrays;

public class ArrayListNums {
    public static int main(ArrayList<Integer> args) {
//        List<Integer> numberList = Arrays.asList(2, 4, 6, 8, 10, 1, 3, 5, 7, 9);
//        ArrayList<Integer> numbers = new ArrayList<>(numberList);
        ArrayList<Integer> numberList = new ArrayList<>();
        numberList.add(1);
        numberList.add(2);
        numberList.add(3);
        numberList.add(4);
        numberList.add(5);
        numberList.add(6);
        numberList.add(7);
        numberList.add(8);
        numberList.add(9);
        numberList.add(10);
        //System.out.println(numberList);
    int evenNumbers = SumIntegers.sumEven(numberList);
        return evenNumbers;
    }
}
