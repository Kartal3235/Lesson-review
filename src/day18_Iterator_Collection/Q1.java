package day18_Iterator_Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Q1 {
    public static void main(String[] args) {

        List<Integer> liste = new ArrayList<>();

        liste.add(5);
        liste.add(6);
        liste.add(7);
        liste.add(8);
        liste.add(9);

        System.out.println(liste);

        ListIterator itr= liste.listIterator();

        while(itr.hasNext()){// yanında element olduğu müddetçe çalışır.

            System.out.println(itr.next());

        }
        while(itr.hasPrevious()){

            System.out.println(itr.previous());
        }

    }
}
