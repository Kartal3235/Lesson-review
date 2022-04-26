package day23_interview;

import java.util.Scanner;

public class Q5 {
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
        System.out.println("String bir ifade giriniz");
        String str= scan.nextLine();

       // palindrome(str);
        stringBuilderPalindrome(str);

    }

    private static void stringBuilderPalindrome(String str) {

        StringBuilder sb1 = new StringBuilder();
        sb1.append(str);
        System.out.println(sb1);
        String ters=sb1.reverse().toString();
        System.out.println(sb1);
        if(ters.equalsIgnoreCase(str)){
            System.out.println("ifade palindromedur");

        }else System.out.println("üzgünüm");


    }}


   //private static void palindrome(String str) {
   //    String str1="";
   //    for (int i = str.length()-1; i >=0 ; i--) {
   //        str1+=str.charAt(i);
   //    }
   //    if(str.equalsIgnoreCase(str1)){
   //        System.out.println("girilen ifade palindromedur");
   //    }else System.out.println("ifade palindrome değildir.");

   //}
    //2. yol


