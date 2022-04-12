package day13;

import java.util.ArrayList;
import java.util.List;

public class Q2 {
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

        //Part1:
        List<String>arr=new ArrayList<>();
        arr.add("red");
        arr.add("green");
        arr.add("blue");
        arr.add("yellow");
        arr.add("black");

        for (String k:arr
             ) {
            System.out.println(k);

        }

        //Part2:
        ilkIndexeEkle(arr,"white");// ilk indexe eklemek istediğim rengi bu şekilde girdim.

    }

    private static void ilkIndexeEkle(List<String> arr, String white) {//parametre olarak rengi aldı
        arr.add(0,"white");
        System.out.println(arr);

        //part:3

        sonIndextenOnceEkle(arr, "pink");
    }

    private static void sonIndextenOnceEkle(List<String> arr, String pink) {

        arr.add(arr.size()-1,"pink");
        System.out.println(arr);
    }
}
