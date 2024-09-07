package DataStructures;

import java.util.ArrayList; // import array list 
import java.util.Collections; // import collection for sorting 

public class arraylist {

    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Toyota");
        cars.add("Tesla");
        cars.add("BMW");

        System.out.println(cars.size()); // get size of array list
        System.out.println(cars); // print out all in array list
        System.out.println(cars.get(0)); // get index 0 array item
        cars.remove(0); // delete item
        System.out.println(cars);

        ArrayList<Integer> myNumbers = new ArrayList<Integer>(); // declaring array list 
        myNumbers.add(33); // add num
        myNumbers.add(15);
        myNumbers.add(20);
        myNumbers.add(34);
        myNumbers.add(8);
        myNumbers.add(12);

        Collections.sort(myNumbers); // Sort number smallest to biggest

        for (int i : myNumbers) {
            System.out.println(i);   // for each loop to loop through array list 
        }

    }
}
