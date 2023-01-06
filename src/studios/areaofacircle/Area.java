package studios.areaofacircle;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Double radius;
        do {
            System.out.println("Enter the radius: ");
            if(!input.hasNextDouble()){
                System.out.println("The radius must be a valid number.");
                return;

            }
            radius = input.nextDouble();

        }
        while (radius < 0); {

        }
        Double area = Circle.getArea(radius);
        System.out.println("The area of a circle with radius " + radius + " is: " + area + ".");

    }
}


