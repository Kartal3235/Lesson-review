package day12_interview;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {


        //  Kullanicidan toplanmak uzere sayilar isteyin
        // sayi adedi 10'u gecerse veya toplam 500 'u gecerse
        // bu kadar sayi yeter
        // ".. adet sayi girdin, toplami..." yazdirin

        Scanner scan= new Scanner(System.in);



        int sayi=0;
        int toplam=0;
        int sayaç=0;

        while(sayaç<10&&toplam<500){
            System.out.println("lütfen sayıları giriniz");
            sayi=scan.nextInt();
            toplam=toplam+sayi;
            sayaç++;
        }
        if(sayaç<10&&toplam<500){
            System.out.println(sayaç+" adet sayı girdiniz.toplami: "+toplam);
        }else System.out.println("bu kadar sayi yeter"+sayaç+"adet sayı girdiniz.toplamı:"+toplam);
    }
}
