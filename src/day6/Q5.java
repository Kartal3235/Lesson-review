package day6;

import java.util.Scanner;

public class Q5 {
    /* TASK :
        Girilen bir stringdeki a harfi sayısını bulunuz.
        ama  c harfine  gelirse döngüden çıkılsın

        Bugün hava oldukca güzel.-> 2
         str.CharAt(0)
        */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen bir string giriniz");
        String str = scan.next();

        int aMiktar = 0;
        for (int i = 0; i < str.length(); i++) {

            if (str.toLowerCase().charAt(i) == 'a') {
                aMiktar++;
            } else if (str.toLowerCase().charAt(i) == 'c') {
                break;

            }


        }
        System.out.println("girdiğiniz strinde c harfini bulana kadar a harfi sayısı:" + aMiktar);
    }
}





