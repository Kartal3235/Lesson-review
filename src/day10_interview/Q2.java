package day10_interview;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("bir sayı giriniz:");
        String satrSayi=scan.next();
       // armstrongMethod(strSayi);
    }

    public static void armstrongMethog(String strSayi) {

        String basamak[]=strSayi.split("");
        int toplam=0;
        for (int i = 0; i < basamak.length ; i++) {

            toplam+=Math.pow(Integer.valueOf(basamak[i]),basamak.length);

        }
        if (Integer.valueOf(strSayi)==toplam);
        System.out.println("armstrong sayidir");
        //else System.out.println("arsmtrong sayı değildir.");
    }

}
