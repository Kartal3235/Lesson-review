package day12_interview;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Kayıt {

List<Kullanıcı> kişiler =new ArrayList<>();// boş list create edildi.kayıtAl() methodu bu liste element atayacak


    public List<Kullanıcı>kayıtAl() {//listi return etmek için yapıldı

        Scanner scan= new Scanner(System.in);
        System.out.println("adınızı giriniz:");
        String isim= scan.nextLine();
        Kullanıcı k1=new Kullanıcı(isim, LocalDateTime.now());//kullanıcı class dan p li cons ile obj create edildi.

        kişiler.add(k1);

        return kişiler;
    }

    public void sanslıKullanıcı(List<Kullanıcı>kll){

        for (Kullanıcı k:kll) {
            if(k.kayıtZamanı.getSecond()<10){
                System.out.println( "sanslı kişisiniz"+k.name+"agam 5 kilo bal kazandım");
            }else System.out.println("maalesef"+k.name+"balllar balının buldunuz kovanınız yağmalandı");

        }

    }
}
