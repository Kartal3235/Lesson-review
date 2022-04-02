package day3;

import java.util.Scanner;

public class q8 {

    public static void main(String[] args) {

        //Kullanicidan bir sifre girmesini isteyin Asagidaki sartlari sagliyorsa “Sifre
        //basari ile tanimlandi”, sartlari saglamazsa “Islem basarisiz,Lutfen yeni bir
        //sifre girin” yazdirin
        //-
        //Ilk harf buyuk harf olmali
        //-
        //Son harf kucuk harf olmali
        //-
        //Sifre bosluk icermemeli
        //-
        //Sifre uzunlugu en az 8 karakter olmali

        Scanner scan=new Scanner(System.in);
        System.out.println("Banka şifrenizi giriniz:");
        String sifre= scan.nextLine();
        boolean ilkHarf=false;

        if(sifre.charAt(0)>='A'&&sifre.charAt(0)<='Z') {
            ilkHarf = true;

        }else{
            System.out.println("İlk harfi büyük giriniz");
        }
        boolean sonHarf=false;
        if(sifre.charAt(sifre.length()-1)>='a'&&sifre.charAt(sifre.length()-1)<='z'){
            sonHarf=true;
        }else{
            System.out.println("son harf küçük harf olamlı");
        }
        boolean bosluk=false;
        if(!sifre.contains(" ")){
            bosluk=true;
        }else{
            System.out.println("şifre boşluk içeriyor olmaz");
        }
        boolean uzunluk=false;

        if(sifre.length()>=8){
            uzunluk=true;
        }else{
            System.out.println("şifre enaz 8 karakter olmalı");
        }

        /*String sifre="Asdf12345a";
        boolean ilkHarf= false;
        if (sifre.charAt(0)>= 'A' && sifre.charAt(0)<='Z'){
            ilkHarf=true;
        }else {
            System.out.println("Sifrenizin ilk harfi Buyuk Harf olmali");
        }
        boolean sonHarf=false;
        if (sifre.charAt(sifre.length()-1)>='a' && sifre.charAt(sifre.length()-1)<='z'){
            sonHarf=true;
        }else {
            System.out.println("Sifrenizin son harfi kucuk harf olmali");
        }
        boolean bosluk= false;
        if (!sifre.contains(" ")){
            bosluk=true;
        } else {
            System.out.println("sifre bosluk icermemeli");
        }
        boolean uzunluk=false;
        if (sifre.length()>=8){
            uzunluk=true;
        } else {
            System.out.println("Sifre en az 8 karakter olmali");
        }
        if (ilkHarf && sonHarf && bosluk && uzunluk){
            System.out.println("sifreniz basarili bir sekilde kaydedildi");
        }*/
    }
}





