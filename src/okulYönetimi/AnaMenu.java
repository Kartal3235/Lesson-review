package okulYönetimi;

import java.util.Scanner;

public class AnaMenu implements AnaMenuInterface{
    static Scanner scan= new Scanner(System.in);

    public static void giris() {
        AnaMenu object=new AnaMenu();
        System.out.println("Okul Yönetimi");
        System.out.println("lütfen seçiminizi yapınız");
        System.out.println("1öğrenci işlmleri 2ogretmen işlemler Qçıkış");

        String scm=scan.next().toUpperCase();
        switch(scm){

            case "1":
                object.ogrenciIslemler();
                break;
            case "2":
                object.ogretmenIslemler();
                break;
            case "Q":
                object.cikis();
                break;
            default:
                System.out.println("lütfen geçerli bir secim yapınız");
                giris();
        }



    }

    @Override
    public void ogrenciIslemler() {
        Islemler.IslemlerMenu(1);

    }

    @Override
    public void ogretmenIslemler() {
        Islemler.IslemlerMenu(2);
    }

    @Override
    public void cikis() {

    }
}
