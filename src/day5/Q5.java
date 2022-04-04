package day5;

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {

         /*  Kullanıcıdan 1'den büyük bir tam sayı girmesini isteyin
	         ve 1'den girilen tam sayıya kadar olan sayıların karelerinin toplamını
	         hesaplayan kodu yazınız.
	        Örnek Ekran Çıktısı
	        Girilen sayı=4
	        Kareler toplamı=14
	     */

        Scanner scan= new Scanner(System.in);
        System.out.println("1 den büyük bir sayı giriniz:");
        int sayi=scan.nextInt();
        int toplam=0;

        for (int i = 1; i <sayi ; i++) {

            toplam = toplam +(i*i);

        }
        System.out.println(toplam);


    }
}
