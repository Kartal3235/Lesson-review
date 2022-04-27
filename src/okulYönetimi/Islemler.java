package okulYönetimi;

import java.util.Scanner;

public class Islemler implements IşlemlerInterface{
static Scanner scan= new Scanner(System.in);
static int secim=0;

    public static void IslemlerMenu(int i) {
        Islemler obj=new Islemler();
        secim=i;
        System.out.println("lütfen seçim yapınız");
        System.out.println("1ekleme 2arama 3listeleme 4silme 5anamenu Qçıkıs");
        int scm= scan.nextInt();
        switch(scm){


            case 1:
                obj.ekleme();
                IslemlerMenu(secim);
                break;
            case 2:
                obj.arama();
                IslemlerMenu(secim);
                break;
            case 3:
                obj.listeleme();
                IslemlerMenu(secim);
                break;
            case 4:
                obj.silme();
                IslemlerMenu(secim);
                break;
            case 5:
                obj.anaMenu();
                IslemlerMenu(secim);
                break;
            case 6:
                obj.cikis();
                IslemlerMenu(secim);
                break;
        }


    }

    @Override
    public void ekleme() {
        System.out.println("kimlik numarası giriniz");
        String kimlikID=scan.next();
        kimlikIDKontrol(kimlikID);
        if(secim==1){
            ogrenciBilgiAlKaydet();
        }else {
            ogretmenBilgiAlKaydet();
        }

    }

    private void ogretmenBilgiAlKaydet() {
    }

    private void ogrenciBilgiAlKaydet() {
        System.out.println("adSoyad yas numara sinif giriniz");
        String adSoyad;
    }

    private void kimlikIDKontrol(String kimlikID) {

        if(Ogrenci.ogrenciListesiMap.containsKey(kimlikID)||Ogretmen.ogretmenListesiMap.containsKey(kimlikID)){
            System.out.println("Bu ID kayıt yapılmış");
            AnaMenu.giris();
        }
    }

    @Override
    public void arama() {

    }

    @Override
    public void listeleme() {

    }

    @Override
    public void silme() {

    }

    @Override
    public void anaMenu() {

    }

    @Override
    public void cikis() {

    }
}
