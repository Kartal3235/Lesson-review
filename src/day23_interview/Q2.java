package day23_interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {

        /*
     Kullanıcıdan alınan bir tamsayıya kadar FIBONACCI dizisi oluşturun.
     0-1-1-2-3-5-8-13-21-34....
     */

        List<Integer> Fibonacci = new ArrayList<>(Arrays.asList(0,1));
        System.out.println(Fibonacci);
        Scanner scan= new Scanner(System.in);
        System.out.println("lütfen bir tamsayı giriniz");
        int sayi = scan.nextInt();
        int i=1;
        if(sayi<=1){
            System.out.println("daha büyük bir tamsayı giriniz");
        }else {
            while(Fibonacci.get(i)<sayi){

                Fibonacci.add(Fibonacci.get(i)+Fibonacci.get(i-1));
                i++;
            }if(Fibonacci.get(Fibonacci.size()-1)>sayi){
                System.out.println("giridiğiniz sayı fibonacci dizgisinde bulunmamaktadır");
            }else System.out.println("girdiğiniz sayı fibonacci dizisinde bulunmaktadır.");

        }
    }
}
