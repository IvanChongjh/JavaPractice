package datastructures;
import java.util.ArrayList; // import array list 

public class arraylist {
    
    public static void main(String[] args)
    {
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Toyota");
        cars.add("Tesla");
        cars.add("BMW");


        System.out.println(cars.size()); // get size of array list
        System.out.println(cars); // print out all in array list
        System.out.println(cars.get(0)); // get index 0 array item
        cars.remove(0); // delete item 
        System.out.println(cars);

    }
}
