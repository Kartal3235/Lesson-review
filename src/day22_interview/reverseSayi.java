package day22_interview;

import java.util.Scanner;

public class reverseSayi {
    public static void main(String[] args) {
        
        /*
        Write a java program to reverse the number which user entered.
        Kullanıcının girdiği sayıyı tersine çeviren bir java programı yazınız.
         */
        Scanner scan= new Scanner(System.in);
        System.out.println("lütfen pozitif bir sayi giriniz:");
        int sayi=scan.nextInt();
        //sayi=54,reverse=45
        int reverse=0;
        while(sayi>0){
            reverse=sayi%10;
            sayi=sayi/10;
            System.out.println(reverse+""+sayi);
            break;
        }
    }
}
