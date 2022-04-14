package day15_interview;

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Bir sayi giriniz:");
        int sayi=scan.nextInt();

        int tersi=0;

        while(sayi>0){

            tersi=sayi%10;
            sayi=sayi/10;
            System.out.print(tersi);
        }

    }
}
