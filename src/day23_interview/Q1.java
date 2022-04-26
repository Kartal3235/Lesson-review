package day23_interview;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {

        /*  soru1: Check if the integer is an Armstrong numbers to 4 digit numbers(4 digit-> exclusive)
        Armstrong sayi:herhangi bir 3 basamakli sayinin rakamlarinin kupleri toplami o sayiyi veriyorsa sayi  Armstrong sayidir
            (0, 1, 153, 370, 371, 407)
            153 = 1*1*1 + 5*5*5 + 3*3*3 = 153
            370 = 3*3*3 + 7*7*7 + 0*0*0 = 370

          soru2: Birden baslayarak girilen sayıya kadar her bir tamsayının amstrong sayı olup olmadıgını
          gösteren program yazınız */

        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen bir sayı giriniz");
        int sayi = scan.nextInt();
        Armstrong(sayi);


    }

    private static void Armstrong(int sayi) {
        int birlerBasamagı=0;
        int ikiBasamaklı=0;
        int basamakKupu=0;

        while(sayi>0) {
            birlerBasamagı = sayi % 10;
            ikiBasamaklı = sayi / 10;
            basamakKupu +=(birlerBasamagı * birlerBasamagı * birlerBasamagı);


        }if(sayi==basamakKupu){
            System.out.println(sayi+" sayisi armstrong sayısıdır.");
        }else System.out.println(sayi+" sayısı armstrong sayısı değildir.");

    }
}
