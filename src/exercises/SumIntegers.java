package exercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SumEvenInt {
    public static void main(String[] args) {
        List<Integer> numberList = Arrays.asList(2,4,6,8,10,1,3,5,7,9);
        ArrayList<Integer> numbers = new ArrayList<>(numberList);


        System.out.println(numbers);

        for(int num: numbers){
            int sum = 0;
            if(num % 2 == 0){
                sum += num;
            }
            return sum;

        }
    }
}
