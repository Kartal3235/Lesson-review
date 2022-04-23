package maps2;

import java.util.Collection;
import java.util.Map;
import java.util.Set;


public class C03_LİsteyiDüzenliYazdırma {

    public static void main(String[] args) {


        C02_MapOluşturrr MapOlusturrr;
        Map<Integer,String>sinif= C02_MapOluşturrr.myMap();
        System.out.println(sinif);
        sinifListYazdir(sinif);
    }

    private static void sinifListYazdir(Map<Integer, String> sinif) {

        System.out.println("Numara  Isım  Soyİsim  Branş");
        System.out.println("============================");
        /*
        MAp yapısında
         */
        Set<Integer> keySet=sinif.keySet();// key leri ayrı ayrı yazdırmasını istiyoruz
        Collection<String>valueSet=sinif.values();

        System.out.println(keySet);
        System.out.println(valueSet);
        System.out.println(valueSet.size());
        for (String each:valueSet
             ) {
            System.out.println(each);
        }

    }
}
