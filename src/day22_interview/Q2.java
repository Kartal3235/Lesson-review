package day22_interview;

import java.util.Scanner;



public class Q2 {
    public static void main(String[] args) {

        /*
         * Kulanicidan alinan bir Stringin ilk ve son harfini yine kulanicidan alinan sayi kadar
         * return eden metod yaziniz
         *
         * ornek:  input            output
         *         elma  2           eaea
         *         army  3           ayayay

         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen bir string ifade giriniz:");
        String str=scan.nextLine();
        System.out.println("bir sayı giriniz:");
        int sayi=scan.nextInt();

        ılkSonHarf(str,sayi);
        System.out.println(ılkSonHarf(str,sayi));


    }

    private static  String ılkSonHarf(String str, int sayi) {

        String abc=str.substring(0,1)+str.substring(str.length()-1);

        String output="";
        for (int i = 0; i <=sayi ; i++) {
            output=output+abc;
        }
        return output;
    }
}
