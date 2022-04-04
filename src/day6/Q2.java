package day6;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        // Soru 11 ) Interview Question Kullanicidan 10’dan kucuk bir  tamsayi isteyin
        // ve girilen sayinin faktoryel'ini bulun. (5!=5*4*3*2*1)

        Scanner scan= new Scanner(System.in);
        System.out.println("lütfen 10 dan küçük sayı giriniz:");
        int sayi= scan.nextInt();

        int faktoryel=1;

        for (int i = 0; i <sayi ; i++) {

            faktoryel*=(sayi-i);


        }
        System.out.println("Girilen sayının faktöriyeli:"+faktoryel);

    }
}
