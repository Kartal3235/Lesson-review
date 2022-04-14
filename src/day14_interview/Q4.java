package day14_interview;

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {

        /*
        Type java code by using while loop,
       Write a program to count the factors of an integer which is entered by user.
       Factors of 12 = 1, 2, 3, 4, 6, 12 ==> 6
       Factors of 8  = 1, 2, 4, 8 ==> 4
       */

        Scanner scan= new Scanner(System.in);
        System.out.println("çarpanlarını bulmak istediğiniz sayıları giriniz:");
        int sayi=Math.abs(scan.nextInt());

        int i=1;//çarpan
        int sayac=0;
        while(i<=sayi){

            if(sayi%i==0){
                sayac++;
                System.err.print(i+" ");

            }
            i++;// çarpanların sayısını arttırmak gerek yoksa döngü dısında assign edilmiş değer ile döngüde sürekli kalır
        }

        System.out.println("sayinin pozitif carpanlarının sayisi: "+sayac);
        System.out.println("sayinin negatif carpanlarının sayisi: "+sayac);
        System.out.println("sayinin tüm carpanlarının sayisi: "+2*sayac);

    }
}
