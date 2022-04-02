package day3;

import java.util.Scanner;

public class Q7 {
    // Kullanicidan 4 harfli bir kelime isteyin
    // ve girilen kelimeyi tersten yazdirin
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen dört harfli bir kelime giriniz:");
        String kelime= scan.next();


        if(kelime.length()<=4){

            char bir=kelime.charAt(0);
            char iki=kelime.charAt(1);
            char üç=kelime.charAt(2);
            char dört=kelime.charAt(3);
            System.out.println("Tersten: "+dört+üç+iki+bir);
        }else{
            System.out.println("hatalı girdiniz");
        }
    }
}
