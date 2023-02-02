package org.launchcode.java.demos.lsn7interfaces;

import java.util.ArrayList;
import java.util.Comparator;

public class ConeComparator implements Comparator <Cone> {

    @Override
    public int compare(Cone cone1, Cone cone2) {
        if (cone1.getCost() - cone2.getCost() > 0) {
            return 1;
        } else if (cone1.getCost() - cone2.getCost() < 0) {
            return -1;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        Case menu3 = new Case();
        ArrayList<Flavor> flavors = menu3.getFlavors();
        ArrayList<Cone> cones = menu3.getCones();
        Comparator<Cone> comparator = new ConeComparator();

        System.out.println(cones);
        cones.sort(comparator);
        System.out.println("************************* \n" + cones);

    }
}