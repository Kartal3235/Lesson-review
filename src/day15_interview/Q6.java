package day15_interview;

import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {

        /*
            How many times a given number is repeated in a sequence
            Create the Java program that finds it.
         */


        int arr[]={1,2,3,4,5,99,88,1,1,4,4,3,3};
        Scanner scan= new Scanner(System.in);
        System.out.println("aranılan sayıyı giriniz:");
        int sayi=scan.nextInt();

        int sayaç=0;
        for (int i = 0; i <arr.length ; i++) {

            if(sayi==arr[i]){
                sayaç++;


            }

        }
        System.out.println("aranılan sayı:"+sayi+"\ntekrar sayısı: "+sayaç);
    }
}
