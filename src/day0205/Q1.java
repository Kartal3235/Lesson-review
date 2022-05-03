package day0205;

import java.util.Scanner;

public class Q1 {

    public static void main(String[] args) {
    Scanner scan= new Scanner(System.in);
        System.out.println("Bir Tamsayı giriniz:");
        int x=scan.nextInt();
    int toplam = 0;
        for (int i = 0; i <=x ; i++) {
            toplam += i;
        }

        System.out.println("toplam = " + toplam);

        Q1 object = new Q1();
            object.sayıToplamı();
    }



    //TASK 01 --> Structured Programming ve Functional Programming ile 1'den x'e kadar tamsayilari toplayan bir program create ediniz.

    //Structured(AMELE) Programming
    public static void sayıToplamı(int ...values){
        int sum = 0;
        for (int each:values
             ) {
            sum += each;
            System.out.println(sum);
        }
    }


    //Functional(cincix Programming



    //TASK 02 --> 1'den x'e kadar cift tamsayilari toplayan bir program create ediniz.


    //TASK 03 --> Ilk x pozitif cift sayiyi toplayan program  create ediniz.


    //TASK 04 --> Ilk X pozitif tek tamsayiyi toplayan programi  create ediniz.


    //TASK 05 --> 2'nin ilk x kuvvetini ekrana yazdiran programi  create ediniz.


    //TASK 06 --> Istenilen bir sayinin ilk x kuvvetini ekrana yazdiran programi  create ediniz.


    //TASK 07 --> Istenilen bir sayinin faktoriyelini hesaplayan programi  create ediniz.


    //TASK 08 --> Istenilen bir sayinin  x. kuvvetini ekrana yazdiran programi  create ediniz.


}
