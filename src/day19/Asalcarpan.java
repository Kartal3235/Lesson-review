package day19;

import java.util.Scanner;

public class Asalcarpan {
    public static void main(String[] args) {


        /* TASK :
         * Pozitif bir tamsayıyı input kabul edip en büyük asal çarpanını veren bir
         * METHOD create ediniz.
         *
         * Ör: Input : 50
         *     Bolenler : 2,5,10,20,50
         *     Asal Bolenler: 2,5
         *     En buyuk asal carpan: 5
         */

        Scanner scan= new Scanner(System.in);
        System.out.println("Lütfen pozitif bir tamsayı giriniz:");
        int sayi=scan.nextInt();
        asalCarpan(sayi);
    }

    private static void asalCarpan(int sayi) {
        int bolen=2;
        for (int i = 2; i <sayi ; i++) {

            if(sayi%i==0){

                bolen=i;
            }

        }
        System.out.println(bolen);
    }
}
