package interview2704;

import java.util.HashMap;
import java.util.Map;

public class Q4 {
    public static void main(String[] args) {
        //5 tane ulke ismi ve nufusunu oluşturuyoruz.(put)
        //5 tane ulke ismi ve nufusunu yazdırıyoruz(country)
        //5 tane ulke ismi yazdırıyoruz. (keyset())
        //5 tane ulke nufusunu yazdırıyoruz. (values())
        //nüfusların toplamını yazdırın.
        //kaç tane 50 milyondan fazla nüfuslu ülke var?
        // ulke ve nufus  lari hem map gibi..hem de ayri ayri yazdirma ?
        // nufus ve ulke sıralaması

        Map<String,Integer> ulke = new HashMap<String,Integer>();

        ulke.put("Almanya",80);
        ulke.put("Türkiye",83);
        ulke.put("Amerika",250);
        ulke.put("Fransa",68);
        ulke.put("Kanada",40);
        System.out.println("ülke isimleri ve nufusları : "+ulke+ " milyondur");

        System.out.println("ülke isimleri : "+ulke.keySet());// keySet(); key'leri Set olarak getiriyor.
        System.out.println("ülke nufusları: "+ulke.values());//[68, 40, 80, 83, 250]

        int sayac=0;//50 milyondan fazla olan ülke sayısı
        for (Integer w:ulke.values()// ulke nufuslarına bak
             ) {
            if(w>50){// 50milyondan büyükse
                sayac++;//+1 arttır
            }
        }
        System.out.println("nüfusu 50 milyondan fazla olan ulke sayısı: "+sayac);

        int nufus=0;
        for (Integer toplam:ulke.values()
             ) {
            nufus+=toplam;
        }
        System.out.println("nufus toplamı :"+nufus);

        for (Map.Entry<String,Integer>sıralama:ulke.entrySet()) {//entrySet( hem ülkelri hemde nufusu alarak sıralama yapıyor)

            System.out.println(sıralama);
        }
        for (String ulkeSırası:ulke.keySet()
             ) {
            System.out.println(ulkeSırası);
        }
        for (Integer nufusSırası:ulke.values()
             ) {
            System.out.println(nufusSırası);
        }
    }
}
