package day14_interview;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {

   /*
    Write a method named isEven that accepts an integer argument.
    The method should return true if the argument is even, or false otherwise.
    */

        Scanner scan= new Scanner(System.in);
        System.out.println("bir sayı giriniz:");
        int sayi=scan.nextInt();

         System.out.println(isEvenCift(sayi));



    }

    private static boolean isEvenCift(int sayi) {

        if(sayi%2==0) return true;
        else return false;
    }


}
