package kitapYönetimi;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q2 {

    static Scanner scan= new Scanner(System.in);
    static int kitapNo=1000;
    static List<EklenenKitaplar> kitapListesi=new ArrayList<>();

    public static void menü(){
        System.out.println("===================================="

                + "\n1- KİTAP EKLE\n2- NUMARA İLE KİTAP GÖRÜNTÜLE\n3- BİLGİ İLE KİTAP GÖRÜNTÜLE\n4-NUMARA İLE KİTAP SİL" +
                "+\nTÜM KİTAPLARI LİSTELE\n6-ÇIKIŞ");
        System.out.print("isleminiz seciniz : ");

        int secim=scan.nextInt();

        switch(secim){

            case 1:
                kitapEkle();
                break;
            case 2:
                numaraileKitapGör();
                break;
            case 3:
                bilgileKitapGör();
                break;
            case 4:
                numaraileKitapSil();
                break;
            case 5:
                tumKitaplarıListe();
                break;
            case 6:
                çıkış();
                break;
            default:
                System.out.println("hatalı giriş yaptınız");
                menü();//"recursive" method call
                break;
        }

}

    private static void çıkış() {
        System.out.println("İYİ GÜNLER,YİNE BEKLERİZ");

    }

    private static void tumKitaplarıListe() {

        System.out.println("=======   LİSTEMİZDEKİ TÜM KİTAPLAR  =======");


    }

    private static void numaraileKitapSil() {

    }

    private static void bilgileKitapGör() {

    }

    private static void numaraileKitapGör() {
        System.out.println("GÖRÜNTÜLEMEK İSTEDİĞİNİZ KİTABIN NUMARASINI GİRİNİZ");
        int numara= scan.nextInt();
        boolean kitapVarmi=true;
        for (EklenenKitaplar each:kitapListesi) {
            if (each.getKitapNo()==numara){

                System.out.println(each);
                kitapVarmi=false;
            }
            
        }
        if (kitapVarmi){
            System.out.println("kusura bakmayın");

        }
        System.out.println("devam etmek için herhangi bir tuşa basınız");
        scan.next();


    }

    private static void kitapEkle() {
        System.out.println("\n=========  KİTAP EKLEME MENUSUNE HOŞGELDİNİZ   ========= ");

        System.out.println("KİTABIN ADI'NI GİRİN:");
        String kitapAdi= scan.nextLine();
        scan.nextLine();

        System.out.println("YAZARIN ADI:");
        String yazarAdi= scan.nextLine();
        scan.nextLine();

        System.out.println("KİTABIN FİYATI:");
        double kitapFiyatı=scan.nextDouble();
        scan.nextLine();

        System.out.println("BASKI YILI");
        int baskıYılı=scan.nextInt();

        EklenenKitaplar kitap=new EklenenKitaplar(kitapAdi,yazarAdi,kitapFiyatı,baskıYılı);
        kitapListesi.add(kitap);





    }
    }
