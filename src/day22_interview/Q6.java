package day22_interview;

import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        /*
        Ask user to enter a name and a character, then check how many times the
        character is repeated in the name using loops in the name
        Kullanıcıdan bir isim ve bir karakter girmesini isteyin, ardından isimdeki döngüleri
        kullanarak karakterin isimde kaç kez tekrarlandığını kontrol edin.
         */

        Scanner scan= new Scanner(System.in);
        System.out.println("lütfen bir isim giriniz:");
        String ısım= scan.nextLine();
        System.out.println("lütfen bir karakter giriniz");
        char abc=scan.next().charAt(0);
        int count=0;
        for (int i = 0; i <ısım.length() ; i++) {
            if(ısım.charAt(i)==abc){
                count++;
            }
        }
        System.out.println("Girdiğiniz cümlede "+abc+" karakterinden "+count+" sayısı kadar vardır.");

    }
}
