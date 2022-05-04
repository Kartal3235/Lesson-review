package day0405;

import java.util.Scanner;

public class Q5 {
    /* TASK :
    100 den kucuk asal sayilari yazdiran bir code create ediniz.
     */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("100 den küçük bir sayı giriniz:");
        int sayi=scan.nextInt();
        int sayac=0;
        while(sayi<100){
            for (int i = 2; i <sayi ; i++) {
                if(sayi%i==0);
                sayac++;
            }

        }if(sayac==0){
            System.out.println("sayı asal sayıdır");
        }else System.out.println("sayı asal sayı değildir.");
    }
}
