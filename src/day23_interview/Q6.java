package day23_interview;

import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        //  Kullanicidan toplanmak uzere sayilar isteyin
        // sayi adedi 10'u gecerse veya toplam 500 'u gecerse
        // bu kadar sayi yeter
        // ".. adet sayi girdin, toplami..." yazdirin
        Scanner scan= new Scanner(System.in);

        int sayi=0;
        int sayac=0;
        int toplam=0;
        while(sayac<10&&toplam<=500){

            System.out.println("lütfen sayılar giriniz:");
            sayi=scan.nextInt();
            toplam=sayi+sayi;
            sayac++;

        }if(sayac<10&&toplam<=500){
            System.out.println(sayac+" adet sayı girdiniz. Toplamı= "+toplam);
        }else System.out.println("üzgünüm, Toplam sonuç= "+toplam);
    }
}
