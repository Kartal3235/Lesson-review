package day18_Iterator_Collection;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Q2_ListeyiTerstenYazdırma {
    public static void main(String[] args) {
        // verilen lisyeti iterator ile sondan başa doğru yazdıralım

        List<Integer> liste = new ArrayList<>();

        liste.add(5);
        liste.add(6);
        liste.add(7);
        liste.add(8);
        liste.add(9);

        System.out.println(liste);

        ListIterator itr=liste.listIterator();//previous kullanmak için ListIterator u kullandık.

        while(itr.hasNext()){
            itr.next();

        }
        System.out.println(liste);

        while(itr.hasPrevious()){
            System.out.println(itr.previous());

        }

    }
}
