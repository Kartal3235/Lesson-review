package maps2;

import java.util.HashMap;
import java.util.Map;

public class C02_MapOluşturrr {

    public static Map<Integer, String> myMap() {
        Map<Integer,String> siniflist=new HashMap<>();

        //bir sınıgfta öğrenci no ve isim,soyisim,branş olarak map oluşturmak istiyoruz

        siniflist.put(101,"Ali,Can,Dev");
        siniflist.put(102,"Veli,Yan,QA");
        siniflist.put(103,"Ali,Yan,C#");

        return siniflist;
    }
}
