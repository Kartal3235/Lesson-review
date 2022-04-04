package day5;

import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {

        // girilen sayının basamaklarındaki rakamların toplamını bulunuz.
        Scanner scan= new Scanner(System.in);
        System.out.println("lütfen dört basamaklı bir sayı giriniz:");
        int sayi=scan.nextInt();

        System.out.println(basamakToplamı(sayi));

    }

    public static int basamakToplamı(int sayi) {
        int toplam = 0;
        while(sayi!=0){

            toplam=sayi%10;
            sayi/=10;

        }

        return toplam;
    }
}
