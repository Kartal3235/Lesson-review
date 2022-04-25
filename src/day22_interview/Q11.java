package day22_interview;

import java.util.Scanner;

public class Q11 {
    public static void main(String[] args) {
        /*
        Write java code checking the number is Perfect number or not.
        Any number can be a Java Perfect Number if the sum of its positive divisors excluding the number itself is equal to that number.
        Input :6 Output:6 is Perfect Number Input :7 Output:7 is not Perfect Number

        Numaranın Mükemmel sayı olup olmadığını kontrol eden Java kodunu yazın.
        Sayının kendisi hariç pozitif bölenlerinin toplamı o sayıya eşitse, herhangi bir sayı Java Mükemmel Sayısı olabilir.
        Girdi :6 Çıktı:6 Mükemmel Sayıdır Girdi :7 Çıktı:7 Mükemmel Sayı değildir
         */

        Scanner scan= new Scanner(System.in);
        System.out.println("lütfen pozitif bir sayı giriniz");
        int sayi = scan.nextInt();
        int num=0;
        for (int i = 1; i <sayi ; i++) {
            if(sayi%i==0){
                num+=i;

            }

        }
        if(sayi==num){
            System.out.println("mükemmel sayıdır");
        }else System.out.println("mükemmerl sayı değildir.");
    }

}
