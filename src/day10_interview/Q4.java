package day10_interview;

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {

        /* Perfect Number (Mukemmel sayi)
      Kullanici tarafindan bir sayiya kadar olan sayilarin,
      mukemmel olup olmadigini bulan method yaziniz.
      Mukemmel sayi : bir sayinin kendisi haric bolenlerinin toplami,
      kendisine esitse o sayi mukemmeldir. (1+2+3 = 6 = 6 (Mukemmel))
      ORNEK: (6, 28, 496, 8128)
      INPUT      : 6
      OUTPUT     :  1,2,3
    */

        Scanner scan = new Scanner(System.in);
        System.out.println("bir sasyı giriniz");
        int sayi= scan.nextInt();

        mukemmelSayi(sayi);

    }

    private static void mukemmelSayi(int sayi) {

        int toplam=0;

        for (int i = 1; i <sayi ; i++) {// 1 den başlıyor burada bölenleri kontroledeceğiz
                                    // sayi dahil değil dediği için(<=)yapmadık

            if(sayi%i==0){//sayının bölenlerini tespit ediyoruz
                toplam+=i;

            }
        }
        if (toplam==sayi){//bölenlerin toplamı sayıya eşitse
            System.out.println("mükemmel sayıdır.");

        }else System.out.println("mükemmel sayıdeğildir");

    }
}
