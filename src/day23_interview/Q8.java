package day23_interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q8 {
    public static void main(String[] args) {

        // Part1:
        // Create an arraylist of Strings
        // add - "Red", "Green", "Blue", "Yellow" and "Black" inside
        // print out all the elements, each element on new line

        // Part2:
        // Create a method that accepts a String arraylist and a String as parameters
        // method should add the element at the first index of arraylist

        // Part3:
        // Create a method that accepts a String arraylist and a String as parameters
        // it should add element before last element
        // ex:  [1, 2, 3]  -> [1, 2, 4, 3]

        // Part1:
         List<String> liste=new ArrayList(Arrays.asList("Red","Green","Blue","Yellow","Black"));
        System.out.println(liste);
        //part2:

        ılkIndexEkle(liste,"white");

        //Part3
        sonElemandanOnceekle(liste,"pink");

    }

    private static void sonElemandanOnceekle(List<String> liste, String pink) {
        liste.add(liste.size()-1,"pink");
        System.out.println(liste);

    }

    private static void ılkIndexEkle(List<String> liste, String white) {
        liste.add(0,"white");
        System.out.println(liste);

    }
}
