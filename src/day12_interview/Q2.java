package day12_interview;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
         /*
        Crteate a program checks if a String is PALINDROME or not.
        If a word, phrase, or sequence that reads the same backword as forward then it is called "palindrome",
        For Example : "madam" or "nursesrun" .
        Kuulanıcının girdiği bir  String'in PALINDROME olup olmadığını kontrol eden bir method create ediniz
        polindrome :tersten okunuşu da aynı olan ifadeierdir.
        ornek : Ey edip Adanada pide ye,  Traş niçin şart
         */

       Scanner scan= new Scanner(System.in);
        System.out.println("String ifade giriniz");
        String ifade= scan.nextLine();

        palindromeWithStringBuılder(ifade);
        palindromeForLoop(ifade);

    }

    private static void palindromeForLoop(String ifade) {
            String tersStr="";
        for (int i = ifade.length()-1; i >=0 ; i++) {

             tersStr+=ifade.charAt(i);

        }

    }

    private static void palindromeWithStringBuılder(String ifade) {
        StringBuilder sb = new StringBuilder(ifade);
        String tersStr=sb.reverse().toString();
        if(ifade.equalsIgnoreCase(tersStr)){
            System.out.println("girilen ifade palindrome");
        }else System.out.println("girilen ifade palindrome değildir.");


    }
}
