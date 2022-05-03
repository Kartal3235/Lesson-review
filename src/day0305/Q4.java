package day0305;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;

public class Q4 {

    /* TASK :

     * Input olarak verilen listteki isimlerden
     * icinde ‘a’ harfi bulunanlari silen bir code create ediniz.
     *
     * INPUT : list1={"Ali","Veli","Ayse","Fatma","Omer"}
     * OUTPUT : [Veli,Omer]
     */

    public static void main(String[] args) {

        ArrayList<String> list1 = new ArrayList<>(Arrays.asList("Ali","Veli","Ayse","Fatma","Omer"));

        ArrayList<String> list2 = new ArrayList<>();

        for (String each:list1) {
            if(!each.toLowerCase().contains("a")){
                list2.add(each);
            }
        }
        System.out.println(list2);
        System.out.println("\n****");
        aOlmayanIsımler(list1);
        System.out.println("\n****");
        aOlmayanIsımler(list1 );
        ArrayList<String> arr1 = new ArrayList<>();

    }
    public static void aOlmayanIsımler(ArrayList<String> list1 ){

        Stream<String> arr1=  list1.stream().filter(t->!t.toLowerCase().contains("a"));

    }

}
