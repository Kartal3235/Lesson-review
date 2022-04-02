package day2;

import java.util.Scanner;

public class Q11 {
    /*
    0 ~ 9 arasındaki sayilari cevirebilen bir java programi yazin
   kelimelere, sayı 9'dan buyuk veya sifirdan kucukse,
   cikis "Gecersiz" olmalidir
   NestedIf ve Ternary kullanarak 2 yolla da cozunuz
 */
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("0-9 arasında sayı yaznız,onu ingilizceye çevirelim: ");
        int sayi1=scan.nextInt();

        if(sayi1==0){
            System.out.println("zero");
        }else if(sayi1==1){
            System.out.println("one");

        }else if(sayi1==2){
            System.out.println("two");
        }else if(sayi1==3){
            System.out.println("tree");
        }else if(sayi1==4){
            System.out.println("four");
        }else if(sayi1==5){
            System.out.println("five");
        }else if(sayi1==6){
            System.out.println("six");
        }else if(sayi1==7){
            System.out.println("seven");
        }else if(sayi1==8){
            System.out.println("eight");
        }else if(sayi1==9){
            System.out.println("nine");
        }else {
            System.out.println("hatalı giriş yaptınız");
        }

        // 2.yol ternary ile çözüm
        /*int sayi=4;
        String result1= sayi==9?"nine":sayi==8?("eihgt"):sayi==7?"seven":sayi==6?"six":sayi==5?"five":sayi==4?"foıur":sayi==3?"tree":sayi==2?"two":sayi==1?"one":sayi==0?("zero"):
        System.out.println(result1);*/

    }
}
