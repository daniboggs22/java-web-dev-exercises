package org.launchcode.java.demos.lsn7interfaces;

import java.util.ArrayList;
import java.util.Comparator;

public class FlavorComparator implements Comparator<Flavor> {
    //compare and sort alphabetically by flavor name
//    @Override
//    public int compare(Flavor flavor1, Flavor flavor2) {
//        return flavor1.getName().compareTo(flavor2.getName());
//    }
//    public static void main(String[] args){
//        Case menu = new Case();
//        ArrayList<Flavor> flavors = menu.getFlavors();
//        ArrayList<Cone> cones = menu.getCones();
//        Comparator comparator = new FlavorComparator();
//        System.out.println(flavors);
//        flavors.sort(comparator);
//        System.out.println(flavors);
//    }
    //create comparator to sort flavors by allergen size highest to lowest
    @Override
    public int compare(Flavor aFlavor1, Flavor aFlavor2) {
        if (aFlavor1.getAllergens().size() > aFlavor2.getAllergens().size()) {
            return -1;
        } else if (aFlavor1.getAllergens().size() < aFlavor2.getAllergens().size()) {
            return 1;
        } else {
            return 0;
        }

    }
    public static void main(String[] args){
        Case menu = new Case();
        ArrayList<Flavor> flavors = menu.getFlavors();
        ArrayList<Cone> cones = menu.getCones();
        Comparator<Flavor> comparator = new FlavorComparator();
        System.out.println(flavors);

        flavors.sort(comparator);
        System.out.println("~~~~~~~~~~~~~~~ \n" + flavors);


    }
}