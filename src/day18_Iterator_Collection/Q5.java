package day18_Iterator_Collection;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Q5 {
    public static void main(String[] args) {

        /*
        Soru 4)
        Bir listedeki elementleri iterator kullanarak sondan basa dogru yazdirin
        */

        List<Integer> liste = new ArrayList<>();

        liste.add(1);
        liste.add(5);
        liste.add(7);
        liste.add(9);
        liste.add(11);
        liste.add(13);


        ListIterator<Integer> itr=liste.listIterator();

        while(itr.hasPrevious()){
           itr.previous();


        }
        System.out.println(itr.previous());
    }
}
