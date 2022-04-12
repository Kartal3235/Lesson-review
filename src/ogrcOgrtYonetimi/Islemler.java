package ogrcOgrtYonetimi;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Islemler {

    static List<Kisi> ogrenciListesi=new ArrayList<>();
    static ArrayList<Kisi>ogrtmListesi=new ArrayList<>();
    static Scanner scan=new Scanner(System.in);
    static String kişiTuru;

    public static void girişPaneli(){
        System.out.println("====================================\nOGRENCI VE OGRETMEN YONETIM PANELI\n" +
                "====================================\n"
                + "1- OGRENCI ISLEMLERI\n2- OGRETMEN ISLEMLERI\nQ- CIKIS");
        System.out.print("isleminiz seciniz : ");

                String secim=scan.next().toUpperCase();

                switch(secim){

                    case "1":
                        kişiTuru="OGRENCI";
                        islemMenusu();
                    break;
                    case "2":
                        kişiTuru="OGRETMEN";
                        islemMenusu();
                    break;
                    case "Q":
                        cıkıs();
                    break;
                    default:
                        System.out.println("hatalı giriş yaptınız");
                        girişPaneli();//"recursive" method call
                        break;
                }





    }

    private static void cıkıs() {
        System.out.println("agam ellerine sağlık\nbir daha bekleriz selametle");
    }

    public static void islemMenusu(){
        System.out.println("Sectiginiz  Kişi turu: "+ kişiTuru+" icin  aşağıdaki işlemlerden tercih yapınız.\r\n"
                + "============= İŞLEMLER =============\r\n"
                + "     1-EKLEME\r\n"
                + "     2-ARAMA\r\n"
                + "     3-LİSTELEME\r\n"
                + "     4-SİLME\r\n"
                + "     0-ANA MENU");
        System.out.print("islem tercihinizi giriniz : ");
        int secilenİslem=scan.nextInt();

        switch(secilenİslem){

            case 1:
                ekle();
                islemMenusu();
                break;
            case 2:
                islemMenusu();
                break;
            case 3:
                islemMenusu();
                break;
            case 4:
                islemMenusu();
                break;
            case 0:
                girişPaneli();
                break;

            default:
                System.out.println("adam gibi bir şey girin");
                islemMenusu();//recursive
        }

    }

    private static void ekle() {// ekle methodu obje için const' a parametre dataları gönderecek
        System.out.println("    ******    "+kişiTuru+"ekleme sayfası  ******   ");
        System.out.println("adSoyad giriniz:");
        scan.nextLine();//dummy hayalet komut yaptık
        String adSoyad =scan.nextLine();
        System.out.println("kimlik no giriniz:");
        String kimlik =scan.nextLine();
        System.out.println("yas giriniz:");
        int yas=scan.nextInt();

        if(kişiTuru.equals("OGRENCI")){
            System.out.println("numara giriniz:");
            String numara =scan.next();                 // ikiside string olduğu için
            System.out.println("sınıf bilgileri giriniz:"); // ard arda yazdırdı,onun için
            String sınıfBilgileri =scan.nextLine();         // dummy attık
            Ogrenci sefilOgrenci =new Ogrenci(adSoyad,kimlik,yas,numara,sınıfBilgileri);//p'li cons. ogrenci obj creat edildi.
            ogrenciListesi.add(sefilOgrenci);
        }else{
            System.out.println("sicilNo giriniz:");
            scan.nextLine();
            String sicilNo =scan.nextLine();
            System.out.println("bölüm giriniz:");
            String bolum =scan.nextLine();
            Ogretmen sefilOgretmen =new Ogretmen(adSoyad,kimlik,yas,bolum,sicilNo);//p'li cons. ogrtmen obj creat edildi.
            ogrtmListesi.add(sefilOgretmen);
        }
    }
}
