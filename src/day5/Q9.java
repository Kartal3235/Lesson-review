package day5;

import java.util.Scanner;

public class Q9 {
    public static void main(String[] args) {

        /*
         Girilen bir sayıya kadar olan sayılardan sadece tek olanlarını ekrana yazdırınız.
         girilen sayı dahil
        */

        Scanner scan= new Scanner(System.in);
        System.out.println("lütfen bir sayı giriniz:");
        int sayi=scan.nextInt();

        while(sayi>0){

            if (sayi%2==1){
                System.out.println(sayi);
                sayi--;
            }
        }

    }
}
