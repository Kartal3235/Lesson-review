package day2;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        // kullanicidan 2 tam sayi alin
        // bu tam sayilari toplayin ve sonucu yazdirin


        /*Scanner scan= new Scanner(System.in);
        System.out.println("Lüten iki tam sayı giriniz: ");

        int sayi1=scan.nextInt();
        int sayi2=scan.nextInt();

        int sum=(sayi1+sayi2);
        System.out.println("Toplam değer: "+sum);*/

        // Kullanıcıdan 3 tam sayı girmesini isyteyin
        // ve bunların ortalamasını yazdırın

        Scanner scan= new Scanner(System.in);
        System.out.println("Lütefen üç tam sayı girinizi agam :");
        int sayi1=scan.nextInt();
        int sayi2=scan.nextInt();
        int sayi3=scan.nextInt();

        int sum=sayi1+sayi2+sayi3;
        int average=sum/3;
        System.out.println("Sayıların ortalaması: "+average);






    }
}
