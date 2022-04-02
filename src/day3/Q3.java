package day3;

import java.util.Scanner;

public class Q3 {
    /*
     * Kullanicidan 4 kelime isteyin ve cumle olarak yazdirip sonuna . koyun
     *
     * Ornek : Inputs : cesaret, insana, sinirlarini, ogretir
     *         Output : Cesaret insana sinirlarini ogretir.
     *
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir kelime giriniz:");
        String kelime1= scan.next();
        System.out.println("Lütfen bir kelime giriniz:");
        String kelime2= scan.next();
        System.out.println("Lütfen bir kelime giriniz:");
        String kelime3= scan.next();
        System.out.println("Lütfen bir kelime giriniz:");
        String kelime4= scan.next();
        System.out.println(kelime1.substring(0,1).toUpperCase()+kelime1.substring(1)+","+kelime2+","+kelime3+","+kelime4);
    }
}
