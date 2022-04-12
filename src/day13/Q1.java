package day13;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {

        /*
    Kullanicidan bir isim ve karakter girmesini isteyin, sonra karakterin kac kez tekrarlandigini kontrol edin.
            char ch= 'e' ;
            String name ="Sevecen"
            => Tekrar Sayisi =3*/


        Scanner scan= new Scanner(System.in);
        System.out.println("bir isim giriniz");
        String isim = scan.next();
        System.out.println("bir karakter giriniz");
        char karakter = scan.next().charAt(0);// tek karakter alır.

        int sayaç=0;
        for (int i = 0; i <isim.length() ; i++) {
            if (isim.charAt(i) ==karakter) {
                sayaç++;
            }

        }
        System.out.println("tekrar sayısı:"+sayaç);
    }

}
