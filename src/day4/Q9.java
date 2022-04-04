package day4;

import java.util.Scanner;

public class Q9 {
    public static void main(String[] args) {

         /*
    cm olarak verilen bir sayiyi, metre ve kilometreye donusturen bir method yaziniz
     */
        Scanner scan= new Scanner(System.in);
        System.out.println("metre veya sntimetre bir sayı giriniz:");
        double santiMetre= scan.nextDouble();

        cevir(santiMetre);
    }

    private static void cevir(double num) {

        double metre=num/100;
        double kMetre=num/100000;
        System.out.println(metre+kMetre);
    }
}
