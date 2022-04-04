package day4;

import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        /*
  Kullanicidan alinan bir tamsayi kadar(47 den kucuk) FIBONACCI dizisi olusturun.
     0-1-1-2-3-5-8-13-21-34....
  */

        Scanner scan= new Scanner(System.in);
        System.out.println("47 den küçük bir sayı giriniz:");
        int sayi=scan.nextInt();

        fiboNACCI(sayi);

    }

    private static void fiboNACCI(int sayi) {

        int sayi1=0;
        int sayi2=1;
        int sayi3;

        System.out.print(sayi1+"-");
        System.out.print(sayi2+"-");
        if(sayi<47) {
            for (int i = 0; i < sayi; i++) {
                sayi3 = sayi1 + sayi2;
                sayi1 = sayi2;
                sayi2 = sayi3;
                System.out.print("-"+sayi3);

            }
        }else System.out.println("hatalı sayı girdiniz");
    }
}
