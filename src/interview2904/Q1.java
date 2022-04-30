package interview2904;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Q1 {

//aşağıdaki çıktıyı elde ediniz
    // Kiraz 100
    // İncir 200
    // Enginar 150
    // Üzüm 145
    // Nar 250

    public static void main(String[] args) {

        Map<String,Integer>fruits=new LinkedHashMap<>();// siralı olarak yazdırır.
        fruits.put("kiraz",100);
        fruits.put("incir",200);
        fruits.put("enginar",150);
        fruits.put("üzüm",145);
        fruits.put("nar",250);
        System.out.println(fruits+" ");

        for (Map.Entry<String,Integer> yeni:fruits.entrySet()
             ) {
            System.out.println(yeni.getKey()+" "+yeni.getValue());
        }

    }
}
