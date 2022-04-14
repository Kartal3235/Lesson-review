package day15_interview;

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        /*
        Ask user to enter an integer.
        If the integer is less than 100, tell user "Won!"
        Otherwise tell user "Lost!"
        */


        int sayi=0;

        do{
            Scanner scan= new Scanner(System.in);
            sayi=scan.nextInt();
            if(sayi<100){
                System.out.println("won!");
            }
        }
        while(sayi<100);
        System.out.println("Lost");

    }
}
