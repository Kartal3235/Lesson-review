package day2;

import java.util.Scanner;

public class Q12 {

    //Kullanicidan ismini ve soyisimi girmesini isteyin, sonrasinda konsola tam ismini buyuk harfler ile yazdirin


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen isim ve soyisminizi giriniz:");
        String name = scan.next();
        String lastname = scan.next();

        String fullname=name.concat(" "+lastname).toUpperCase();

        System.out.println(fullname);


    }
}
