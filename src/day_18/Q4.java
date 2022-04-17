package day_18;

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {


        /*
    Bakıye (başlangıç bakıyesi 1000 tl) öğrenme, para yatırma ve cekme, çıkış
    işlemlerinin yapıldıgı bir ATM app. code create ediniz
     */

        Scanner scan= new Scanner(System.in);
        System.out.println("*********ATM HOŞGELDİNİZ*********");
        System.out.println("Yapacağınız işlemleri seçiniz:\n1-Bakiye Öğrenme\n2-Para Yatırma\n3-Para Çekme\n4-ÇIKIŞ");
        int secim=scan.nextInt();
        int bakıye=1000;

        switch(secim) {

            case 1:
                System.out.println("Hesabınızda" + bakıye);
                break;
            case 2:
                int yatırılanMıktar = 0;
                System.out.println("Yatıracağınız Miktarı giriniz:" + yatırılanMıktar);
                yatırılanMıktar = scan.nextInt();
                bakıye = bakıye + yatırılanMıktar;
                System.out.println("Bakiyenin güncel hali:"+bakıye);
                break;

            case 3:
                System.out.println("Çekeceğiniz miktarı belirtiniz:");
                int cekılen = scan.nextInt();
                if(bakıye<cekılen){
                    System.out.println("Kusura bakmayınız size yardımcı olamıyorum");
                }else{
                    cekılen=bakıye-cekılen;
                    System.out.println("Çekilen Miktar:"+cekılen);
                }break;
            case 4:
                System.out.println("Çıkış yapmış bulunuyorsunuz teşekkürler");
                break;



        }

    }
}
