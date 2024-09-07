package DataStructures;
import java.util.HashMap;
public class hashmap {
    public static void main(String[] args)
    {

            // Create a HashMap object called capitalCities
    HashMap<String, String> capitalCities = new HashMap<String, String>();

    // Add keys and values (Country, City)
    capitalCities.put("England", "London");
    capitalCities.put("Germany", "Berlin");
    capitalCities.put("Norway", "Oslo");
    capitalCities.put("USA", "Washington DC");
    System.out.println(capitalCities);


    System.out.println(capitalCities.get("England")); // get the value that has England as key

    capitalCities.remove("England"); // remove value that is has England as key 

    System.out.println(capitalCities); // check hashmap
    }
}
