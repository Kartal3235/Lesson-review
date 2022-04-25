package day22_interview;

import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
        /*
        Write a return method that accepts an integer as input and
        calculates factorial and prints like output.
        Girdi olarak bir tamsayı kabul eden ve faktöriyel hesaplayan
        ve çıktı gibi yazdıran bir dönüş yöntemi yazın.
         */
        Scanner scan= new Scanner(System.in);
        System.out.println("lütfen bir tamsayı giriniz:");
        int sayi=scan.nextInt();
        int faktöriyel=1;
        for (int i = 1; i <=sayi ; i++) {
             faktöriyel=faktöriyel*i;
        }
        System.out.println(faktöriyel);
    }
}
