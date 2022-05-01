package day0105;

import java.util.Scanner;

public class Q4 {

    /* TASK :
         Kullanicidan aldigimiz 8 elemanli arrayin icinde
        3 e bolunebilen sayi adedini yazdıran java code create ediniz (negatif sayilar da dahil olsun)

         */
    public static void main(String[] args) {
        /*int []sayi1=new int [8];
        Scanner scan = new Scanner(System.in);
        int count = 0;
        for (int i = 0; i <=8 ; i++) {
            System.out.println(i+" inci indeksli sayı giriniz");
            sayi1[i]= scan.nextInt();
            if(sayi1[i]%3==0){
            count++;

            }


        }
        System.out.println("3 e bölünebilen sayı adedi: "+count);*/

        Scanner scan = new Scanner(System.in);

        int []sayi1=new int [8];
        for (int i = 0; i <=8 ; i++) {
            System.out.println(i+" indeksli sayı");
            sayi1[i]=scan.nextInt();
            System.out.println(sayi1[i]);
        }


    }
    public static void sekizEl3BlnenSayıGiriniz(int []sayi1){


    }
}
