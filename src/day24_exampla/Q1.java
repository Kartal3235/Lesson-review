package day24_exampla;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        /*TASK : Kullanıcıdan alacağınız bir stringde boşluk
        karakterinin olup olmadığını kontrol ediniz.
         */
        Scanner scan= new Scanner(System.in);
        System.out.println("lütfen bir string ifade giriniz:");
        String str=scan.nextLine();


        boolean boslukVarMi=str.contains(" ");
        System.out.println("boşluk var mı: "+boslukVarMi);

    }

}
