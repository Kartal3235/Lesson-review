package interview3004;

import java.util.HashMap;
import java.util.Map;

public class Q1 {

    /*
        Hashmap ile 1 den 6 ya kadar sayilari sayi ve okunusu seklinde yazdirin
    */
    public static void main(String[] args) {

        Map<Integer,String>map=new HashMap<>();
        map.put(1,"bir");
        map.put(2,"iki");
        map.put(3,"üç");
        map.put(4,"dört");
        map.put(5,"beş");
        map.put(6,"altı");
        System.out.println(map+" ");

        for (Map.Entry<Integer,String>x:map.entrySet()
             ) {
            System.out.println(x);
        }
    }
}
