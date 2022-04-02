package day3;

import java.util.Scanner;

public class Q6 {
     /*
		Kullanicidan bir kelime girmesini isteyin.
		* Sozcukte tek sayida karakter ve 3 veya daha fazla karakter iceriyorsa,
		* kelimenin ortasindaki karakteri yazdirin.
		*/
     public static void main(String[] args) {
         Scanner scan= new Scanner(System.in);
         System.out.println("Lütfen bir kelime giriniz: ");
         String kelime=scan.next();
         char ortancaKarakter=kelime.charAt(kelime.length()-1/2);

         if(kelime.length()>=3&&kelime.length()%2==1){
             System.out.println(ortancaKarakter);


         }else{
             System.out.println("hatalı");
         }
     }
}
