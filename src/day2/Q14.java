package day2;

import java.util.Scanner;

public class Q14 {

    //Scanner kullanarak iki ayri deger giriniz ve bu iki kelimeyi method kullanarak birlestiriniz.

    //yukardaki ornekte verilen ilk ve ikinci degiskenlerinin ilk harflerini atip birlestiriniz.
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("bir değer giriniz");
        String str1= scan.next();
        System.out.println("bir değer giriniz");
        String str2= scan.next();

        System.out.println(str1.concat(" "+str2));

        String ilkharsiz=str1.substring(1);
        String ikinciilkharfsiz=str2.substring(1);
        System.out.println("ilk harfsiz halleri:" +ilkharsiz+" "+ikinciilkharfsiz);

    }
}
