package interview3004;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Q3 {
     /* 1- Kullanıcıdan bir kişinin kimlik numarsını(4 haneli), tam ismini, adresini , telefonunu alın.
       2- Kimlik numarasını key olarak, diğer bilgileri value olarak bir mape depolayın
       3- Kimlik numarasını girerek kullanıcını bilgilerini ekrana yazdırın
       4- Tüm kullanicilarin isimlerini ekrana yazdıralım
    */
     public static void main(String[] args) throws InterruptedException {
         String secim="";
         Map<Integer,HashMap<String,String>>kisiListesi=new HashMap<>();
         //[  key  ],[       values        ]

         Scanner scan= new Scanner(System.in);
         HashMap<String,String>kisi = new HashMap<>();
         do {

             System.out.println("adınız ve soyadınızı giriniz");
             kisi.put("adınnız ve soyadınız", scan.nextLine());// kulllanıcıdan alınan isim direk map de isim key'nin valusuna karşılık gelsin
             System.out.println("adres bilgileriniz");
             kisi.put("adres ", scan.nextLine());// kulllanıcıdan alınan adres direk map de adres key'nin valusuna karşılık gelsin
             System.out.println("teleefon numaranız");
             kisi.put("telefon", scan.nextLine());// kulllanıcıdan alınan telefon direk map de telefon key'nin valusuna karşılık gelsin
             System.out.println("kimlik no giriniz");

             // iç içe yapı var kullanıcıdan alınan bilgiler TC'ye göre şekillendiği için...
             // kisiListesindeki TC datası;diğer kis'leri bunyesinde barındırıyor.

             kisiListesi.put(scan.nextInt(), kisi);//TC yi kisiListesi map ine ekledik
             // TC-> key
             // kisi->values;
             scan.nextLine();
             System.out.println("kisi = " + kisi);
             System.out.println("kisiListesi = " + kisiListesi);
             System.out.println("Devam etmek istiyorsanız: E/H");
             secim=scan.nextLine();
         }while(secim.equalsIgnoreCase("E"));

         System.out.println("görmek istediğiniz kişinin kimlik numarasını giriniz: ");
         System.out.println(kisiListesi.get(scan.nextInt()));
     }
}

