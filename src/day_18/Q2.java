package day_18;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {

        // Girilen bir ay numarasına göre , ayın kaç gün olduğunu sayı ile yazdırınız

        Scanner scan= new Scanner(System.in);
        System.out.println("bir ay numöarası giriniz");
        int ayNo=scan.nextInt();

        switch(ayNo){

            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("Girdiğiniz ayda 31 gün vardır");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("girdiğiniz ay da 30 gün vardır.");
                break;

            case 2:
                System.out.println("Lütfen bir sayı giriniz.");
                int sayi=scan.nextInt();

            if(sayi%4==0){
                System.out.println("giridiğiniz yıl 29 gün içeriyor");

            }else System.out.println("girdiğiniz yıl 28 gün içerir.");



            }

        }

    }

