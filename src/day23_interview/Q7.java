package day23_interview;

import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
    /*
    Kullanicidan bir isim ve karakter girmesini isteyin, sonra karakterin kac kez tekrarlandigini kontrol edin.
            char ch= 'e' ;
            String name ="Sevecen"
            => Tekrar Sayisi = 3

     */
        Scanner scan= new Scanner(System.in);
        System.out.println("lütfen bir isim giriniz");
        String str= scan.nextLine();
        System.out.println("lütfen bir karakter giriniz:");
        char ch=scan.next().charAt(0);

        int sayac=0;
        for (int i = 0; i <str.length() ; i++) {
            if(str.charAt(i)==ch){
                sayac++;
            }

        }System.out.print(sayac);
    }
}
