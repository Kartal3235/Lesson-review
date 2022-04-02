package day2;

import java.util.Scanner;

public class Q4 {/*
 * Ternary kullanarak bir kod yazin. fiyat isminde bir variable tanimlayin. eger fiyat
 * 10 dan az ise "ucuz" , 10 ile 20 arasinda ise "normal" , 20 ve 20 den buyuk ise pahali
 * olsun
 */

    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Lütfen bir fiyat giriniz:");
        int fiyat=scan.nextInt();

        if(fiyat<10){
            System.out.println("ucuz");
        }else if(fiyat>10&&fiyat<20){
            System.out.println("normal");
        }else if(fiyat>20){
            System.out.println("Agam fiyat çok pahalı");
        }


    }
}
