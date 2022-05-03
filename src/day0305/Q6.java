package day0305;

import java.util.ArrayList;
import java.util.Scanner;

public class Q6 {
    /* TASK :
         Bir öğretmenden girmek istediği kadar notu alınız, ve
         ortalamayı geçen öğrenci sayısını bulan code create ediniz.

         */

    public static void main(String[] args) throws InterruptedException {

        ArrayList<Integer> list1=new ArrayList<Integer>();
        Scanner scan=new Scanner(System.in);
        String islem;
        do{
            System.out.println("lütfen not giriniz:");
            int not=scan.nextInt();
            list1.add(not);
            System.out.println("not girmeye devam etmek istiyormusun E/H");
            islem=scan.next();
        }while(islem.equalsIgnoreCase("e"));

        int toplam=0;
        for (int i = 0; i < list1.size() ; i++) {
            toplam+=list1.get(i);

        }
        System.out.println(toplam);

        Thread.sleep(5000);
        double ortalama=toplam/ list1.size();
        int ortaGecSayı=0;
        for (int i = 0; i < list1.size() ; i++) {

            if(list1.get(i)> ortalama){
                ortaGecSayı++;
            }

        }
        System.out.println("ortaGecSayı = " + ortaGecSayı);



    }
}
