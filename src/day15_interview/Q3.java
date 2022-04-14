package day15_interview;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {

         /*
            How many times a given number is repeated in a sequence
            Create the Java program that finds it.
         */

        int arr[]={1,2,3,1,1,1,77,88,99,12,14,16,2,3,2,};

        int sayaç=0;
        Scanner scan= new Scanner(System.in);
        System.out.println("aranılan sayıyı giriniz: ");
        int sayi=scan.nextInt();

        for (int i = 0; i <arr.length ; i++) {

            if (sayi==arr[i]){
                sayaç++;
            }

        }
        System.out.println("aranılan sayi: "+sayi+"\ntekrar sayısıda: "+sayaç);

    }
}
