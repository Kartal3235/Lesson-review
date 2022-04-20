package day21_interview;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {


        // Dikey olarak bolunen bir agac sekli ciziniz.. agacin tac uzunlugunu kullanicidan aliniz..
        // Not :govde sabit sayi olsun
    /* tac uzunlugu -> 6 iken

    ^
    ^^
    ^^^
    ^^^^
    ^^^^^
    ^^^^^^
    |||
    |||
    |||
    |||
    |||
     */

        Scanner scan= new Scanner(System.in);
        System.out.println("agacın tac uzunluğunu giriniz:");
        int tacUzunluk=scan.nextInt();

        String yaz="";// Bu değişkeni tanımladık, for loop içinde kullanmak için

        for (int i = 0; i <tacUzunluk ; i++) {

            yaz=yaz+"^";// bu kod satırı sayesinde nested for loop a ihtiyaç duymadan yazdık

            System.out.println(yaz);

        }
       ;
        for (int i = 0; i < 5; i++) {// gövde sabit sayı olduğundan kendimiz i<5 kısmını yazdık


            System.out.println("|||");

        }
    }
}
