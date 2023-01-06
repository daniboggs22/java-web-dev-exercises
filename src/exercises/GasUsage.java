package exercises;

import java.util.Scanner;

public class GasUsage {
    public static void main (String[] arg) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter how many miles you have driven: ");
        Double miles = input.nextDouble();

        System.out.println("Enter the amount of gas you have used in gallons: ");
        Double gas = input.nextDouble();

        input.close();

        Double milesPerGallon = miles/ gas;

        System.out.println("You get " + milesPerGallon + " miles per gallon.");
    }

}



