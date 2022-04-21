package MapKullanımı;

import java.util.Collection;
import java.util.Collections;
import java.util.Map;
import java.util.Set;

public class C03DüzenleYazdırma {
    public static void main(String[] args) {

        Map<Integer,String> sinif=MapOlustur.myMap();

        System.out.println(sinif);

        sinifListYazdir(sinif);
    }

    private static void sinifListYazdir(Map<Integer, String> sinif) {

        System.out.println("Numara   Isim   soyisim   Branş");
        System.out.println("================================");

        //Map yapısından yazdırdığımızda kullanıcılar bir şey anlamayabilir.
        //bunun için map yapısını kodlarla manıpule edip
        // map dataları istediğimiz formata sokmamız gerekir.
        Set<Integer> keySet=sinif.keySet();

        Collection<String> valueSet=sinif.values();
        System.out.println(keySet);
        System.out.println(valueSet);
        System.out.println(valueSet.size());

        for (String each:valueSet
             ) {
            System.out.println(each);
        }
    }

}
