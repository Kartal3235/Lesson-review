package day17;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {

        //Kullanıcıdan aldığınız 4 basamaklı bir sayinin
        //basamaklar toplamının bulunuz?

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen dört basamaklı bir tamsayı giriniz: ");
        int sayi=scan.nextInt();

        int rakam = 0;
        int rakamlarToplamı = 0;

        // 1.adımda r=0,rt=0 sayi=7532

        rakam=sayi % 10;
        rakamlarToplamı+=rakam;// 2
        sayi/=10;//753

        // 2. adımda r=2,rt=2

        rakam=sayi%10;// 3
        rakamlarToplamı += rakam;// 5
        sayi/=10;// 75

        // 3. adımda r=3,rt=5

        rakam=sayi % 10;// 5
        rakamlarToplamı += rakam; //10
        sayi/=10;//7

        // 4.adımda

        rakam=sayi % 10;// 7
        rakamlarToplamı+=rakam;//17
        sayi/=10;//0

        System.out.println("Girdiğiniz sayının rakmalar toplamı: "+rakamlarToplamı);



    }
}
