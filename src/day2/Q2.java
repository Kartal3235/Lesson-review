package day2;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        /*
         * KullanicidanY/N ikilisinden birisini girdiginde girdigi degeri
         * ekrana yazdiran java kodunu yaziniz.
         * INPUT : Y ,  N
         * OUTPUT : YES ; NO
         */

        Scanner scan= new Scanner(System.in);
        System.out.println("Lğtefn Y/N ikilisinden birisini giriniz : ");
        char karakter=scan.next().charAt(0);

        if(karakter=='Y'|| karakter=='y'){
            System.out.println("Yes");

        }else if(karakter=='N'|| karakter=='n'){
            System.out.println("No");
        }else{
            System.out.println("YAnlış giriş yaptınız" );
        }




    }

    public static class Q3 {
        public static void main(String[] args) {
             /*
        not hesaplayici
                   A => 90 ~100
                   B => 80 ~ 89
                   C => 70 ~ 79
                   D => 60 ~ 69
                   F =>  0 ~ 59
         */

            Scanner scan= new Scanner(System.in);
            System.out.println("Lütefen notunuzu giriniz:");
            int grade=scan.nextInt();

            if(grade>90&&grade<100){
                System.out.println("Çok iyisin agam");
            }else if(grade>80&&grade<89){
                System.out.println("İyisin");
            }else if(grade>70&&grade<79){
                System.out.println("Fena değilsin dostum");
            }else if(grade>60&&grade<69){
                System.out.println("Çalışmaya devam");
            }else if(grade>0&&grade<59){
                System.out.println("Çalış çalış");
            }else {
                System.out.println("hatalı giriş yaptınız kontrol ediniz" );
            }

        }
    }
}
