package day21_interview;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {

        // Girilen bir stringin harflerini teker teker ekrana alt alta olacak
        // sekilde yazdiriniz, bosluk veya a harfi geldiginde bunlari yazmasin

        Scanner scan= new Scanner(System.in);
        System.out.println("lütfewn ifade giriniz:");
        String str=scan.nextLine();

        for (int i = 0; i <str.length() ; i++) {
            if(str.charAt(i)=='a'||str.charAt(i)==' '){

                continue;// Bu satır çalıştığında döngünün başına gider.
                         // Çünkü 'a' veya boşluk var iken herhangi bir çıktısını istemiyor.
                        // Break aklınıza gelebilir.Ancak break kodu tamamen kırar ve devam etmez.



            }System.out.println(str.charAt(i));

        }
    }
}
