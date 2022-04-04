package day4;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {

        // Kullanıcıdan bir kelime isteyin,
        //eğer kelime 3 harften kıssa ise "kelime cok kısa" yazdırın
        //eğer kelime 3,4,5 harfli ise harf sayısını ve
        // kelimenin terrsten yazılışını yazdırın
        //eğer 5 harften uzunsa"kelime çok uzun" yazdırın

        Scanner scan= new Scanner(System.in);
        System.out.println("Lütfne bir kelime giriniz:");
        String kelime= scan.next();
        int harfsayısı=kelime.length();

        if(harfsayısı<3){
            System.out.println("kelime çok kısa");
        }else if(harfsayısı==3){
            ucHarfiTersineCevir(kelime);
        }else if(harfsayısı==4){
            dortHarfiTersineCevir(kelime);
        }else if(harfsayısı==5){
            besHarfiTersineCevir(kelime);
        }else{
            System.out.println("kelime çok uzun");
        }



        /*Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir kelime giriniz");
        String kelime=scan.next();
        int harfSayisi=kelime.length();
        if (harfSayisi<3){
            System.out.println("kelime cok kisa");
        }else if(harfSayisi==3){
            ucHarfiTersineCevir(kelime);
        }else if (harfSayisi==4){
            dortHarfiTersineCevir(kelime);
        }else if (harfSayisi==5){
            besHarfiTersineCevir(kelime);
        }else{
            System.out.println("kelime cok uzun");
        }
    }
    private static void besHarfiTersineCevir(String kelime) {
        String tersKelime= kelime.substring(4)+
                kelime.substring(3,4)+
                kelime.substring(2,3)+
                kelime.substring(1,2)+
                kelime.substring(0,1);
        System.out.println("girdiginiz kelimedeki harf sayisi : 5" );
        System.out.println("kelimenin tersten yazilisi : " + tersKelime);
    }
    // 1- method olusturmak icin method'un adini yazariz
    // 2- method'a giderken goturmem gerek variable varsa, bunu method'a eklemeliyim
    private static void dortHarfiTersineCevir(String kelime) {
        String tersKelime=kelime.substring(3)+
                kelime.substring(2,3)+
                kelime.substring(1,2)+
                kelime.substring(0,1);
        System.out.println("girdiginiz kelimedeki harf sayisi : 4" );
        System.out.println("kelimenin tersten yazilisi : " + tersKelime);
    }
    private static void ucHarfiTersineCevir(String kelime) {
        String tersKelime=kelime.substring(2)+
                kelime.substring(1,2)+
                kelime.substring(0,1);
        System.out.println("girdiginiz kelimedeki harf sayisi : 3" );
        System.out.println("kelimenin tersten yazilisi : " + tersKelime);*/
    }

    private static void besHarfiTersineCevir(String kelime) {
        String tersKelime = kelime.substring(4)+kelime.substring(3,4)+kelime.substring(2,3)+kelime.substring(1,2)+kelime.substring(0,1);
        System.out.println(tersKelime);
    }

    static void dortHarfiTersineCevir(String kelime) {
        String tersKelime = kelime.substring(3)+kelime.substring(2,3)+kelime.substring(1,2)+kelime.substring(0,1);
        System.out.println(tersKelime);
    }

    static void ucHarfiTersineCevir(String kelime) {
        String tersKelime = kelime.substring(2)+kelime.substring(1,2)+kelime.substring(0,1);
        System.out.println(tersKelime);

    }
}









