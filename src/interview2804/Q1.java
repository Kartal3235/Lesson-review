package interview2804;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Q1 {
    public static void main(String[] args) {

        // create a map of zipcodes and Cities, at least 3 entries
        // get the keySet and iterate over it, print the map like below:
        // zipcode1 => city1
        // zipcode2 => city2
        // part 2: print all the keys of the map
        Map<Integer,String> zipcodeAndCities=new HashMap<>();
        zipcodeAndCities.put(85001,"Arizona");
        zipcodeAndCities.put(71601,"Arkansas");
        zipcodeAndCities.put(80001,"Colorado");

        Set<Integer> keys=zipcodeAndCities.keySet();
        System.out.println(zipcodeAndCities.keySet());

        for (Integer key:keys
             ) {
            System.out.println(key+ "=> "+zipcodeAndCities.get(key));
        }
    }
}
