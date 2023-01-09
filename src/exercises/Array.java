package exercises;

public class Array {
    public static void main(String[] arg) {
        int[] numArray = {1, 1, 2, 3, 5, 8};

      for (int i : numArray) {
          if(!(i % 2 == 0))
          System.out.println(i);

        }
    }
}