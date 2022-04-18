package day19;

import java.util.Scanner;

public class Task {
    public static void main(String[] args) {

        /*
        TASK :
        addDigits isminde bir method create ediniz.
        Parametresi int
        Return tipi de int
        Pozitif int değerler ver ve en son sonuç tek basamaklı çıkana kadar basamakları birbiriyle topla.
        Tek basamaklı çıktığında, return etsin

        Örnek1:
        Girdi 38
        Çıktı: 2
        Açıklama: İşlemler şöyle olacak: 3 + 8 = 11, 1 + 1 = 2.
                     2 , tek basamaklı olduğundan, bunu döndürün.
        */

        Scanner scan= new Scanner(System.in);
        System.out.println("Lütfen pozitif bir tamsayı giriniz:");
        int sayi=scan.nextInt();


        System.out.println(rakamTopla(sayi));

    }

    private static int addDigits(int sayi) {

        while(sayi>=10){

            sayi=rakamTopla(sayi);


        }
        return sayi;
    }

    private static int rakamTopla(int sayi) {

        int rakam = 0;
        int toplam=0;
       while(sayi>0) {
           rakam = sayi % 10;
           toplam = rakam + rakam;
           sayi=sayi/10;

       }
       return toplam;
    }

}
