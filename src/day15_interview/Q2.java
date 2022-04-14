package day15_interview;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {

        /*
        Ask user to enter an integer.
        If the integer is less than 100, tell user "Won!"
        Otherwise tell user "Lost!"
        */

        Scanner scan= new Scanner(System.in);
        int sayi=0;

        do{// soruda "olduğu sürece" dediği için do while yapıyoruz
            System.out.println("bir sayı giriniz:");// 120 girerse bu satır ve aşağıdaki satır çalışır
            sayi=scan.nextInt();
            if(sayi<100){// ancak 120 için burası çalışmaz
                System.out.println("Won!");
            }
        }while(sayi<100);// 100 den küçük olduğu surece bu kod bloğu çalışır
        System.out.println("Lost!");// 120 için bu kod bloğu çalıuşır.
    }
}
