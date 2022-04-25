package day22_interview;

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) throws InterruptedException {

        // STRING OLAN PIN kodunuzu kontrol eden bir kod yazınız.

        Scanner scan=new Scanner(System.in);
        String sifre="abcdefg1234.";
        int gırıshakkı=4;



        System.out.println("**********Hoşgeldiniz***********");

        while(true) {
            System.out.println("Lütfen String PIN kodu giriniz:");
            String gırılenPın = scan.nextLine();

            if (gırılenPın.equals(sifre)) {
                System.out.println("Doğru giriş yaptınız,Tebrikler");
            } else {
                System.out.println("yanlış giriş yaptınız,Üzgünüm");
                gırıshakkı--;
            }
            if (gırıshakkı == 0) {
                System.out.println("Kusura bakmayın giriş hakkınız doldu,cortladınız");
                Thread.sleep(5000);
            }
        }


    }
}
