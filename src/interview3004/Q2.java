package interview3004;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Q2 {
    // TreeMap kullanarak bir cümlenin içindeki harflerin frekansını method ile bulunuz.
    /*
    TreeMap özellikleri;
    diğerlerine göre yavaştır.Hashmap'e göre yavaştır.
    sıralama yapıyor çünkü,
    hashmap ratsgele atıyor
    en hızlı hashmap sonra linkednhashmap,daha sonra TrreMap
     */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("cumle giriniz");
        String cumle= scan.nextLine().toLowerCase();

        frekens(cumle);//1.yol

        Map<String,Integer> map=frekans2(cumle);//2.yol==> array sınıfından faydalanarak
        System.out.println(map);
    }

    private static Map<String, Integer> frekans2(String cumle) {

        String harfler[]=cumle.split("");
        Map<String, Integer>map=new HashMap<>();
        for (String each:harfler
             ) {
            if(!map.containsKey(each)){//daha önceden map içinde yoksa
                map.put(each,1);//sayısı bir olsun
            }else {
                map.put(each,map.get(each)+1);// daha önceden map içinde bu harf varsa sayısını 1 arttır.
            }
        }
        return map;
    }

    private static void frekens(String cumle) {

        TreeMap<Character,Integer>frMap=new TreeMap<>();//bu bizim contanier

        for (int i = 0; i <cumle.length() ; i++) {
            if(frMap.containsKey(cumle.charAt(i))){//cumleyi karakterlere böler
                frMap.replace(cumle.charAt(i),cumle.charAt(i)+1);
                // karakterleri saydırmada aynı karakterden varsa sayısını 1 arttırarak guncelller

            }else{
                frMap.put(cumle.charAt(i),1);
                //frMap içine önceden bu karakter yoksa o zaman bu satır calışır.
            }

        }
        System.out.println(frMap);


    }
}
