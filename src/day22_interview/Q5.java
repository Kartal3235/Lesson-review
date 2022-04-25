package day22_interview;

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {

        /*
         * Kullanicidan bir cumle ve bir harf alin,
         * Cumlede harfin kac kere
         * kullanildigini bulup, yazdirin
         *
         * ORNEK:
         *
         * INPUT : Cumle: Java ogrenmek cok guzel. Harf :e
         *
         * OUTPUT : Girdiginiz cumlede "e" harfi 3 kere kullanilmis.
         */

        Scanner scan= new Scanner(System.in);
        System.out.println("lütfen bir cümle giriniz:");
        String cümle=scan.nextLine();
        System.out.println("lütfen bir karakter giriniz:");
        char krktr=scan.next().charAt(0);

        int count=0;
        for (int i = 0; i <cümle.length() ; i++) {
            if(cümle.charAt(i)==krktr){
                count++;

            }
        }
        System.out.println(" giridiğiniz cümlede "+krktr+" harfinden "+count+" sayısı kadar bulunmaktadır");


    }
}