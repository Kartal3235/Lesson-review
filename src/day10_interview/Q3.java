package day10_interview;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q3 {
    /*
     Kullanıcıdan alınan bir tamsayıya kadar FIBONACCI dizisi oluşturun.
     0-1-1-2-3-5-8-13-21-34....
     */
    public static void main(String[] args) {
        List<Integer>fibonacci=new ArrayList<>();
        Scanner scan= new Scanner(System.in);
        System.out.println("bir sayı giriniz");
        int sayi= scan.nextInt();
        fibonacci.add(0);
        fibonacci.add(1);

        int i=1;// start condition
        if (sayi<=1){
            System.out.println("daha büyük sayı giriniz");
        }else{     //ortadaki condition
            while(fibonacci.get(i)<sayi){// burdaki mantıgı anlamadım?(ben sayıyı getirdim hangi sayıyı getirecek
                fibonacci.add(fibonacci.get(i)+fibonacci.get(i-1));
                i++;

            }
            if (fibonacci.get(fibonacci.size()-1)>sayi){//fibonaccinin son elemanı sayıdan büyükse
                fibonacci.remove(fibonacci.size()-1);//elemanı kaldır
                System.out.println("girdiğiniz sayi fibonacci dizisinde bulunmamaktadır."+
                        "\n girilen sayıya kadar fibonacci dizisi:"+fibonacci );

            }else System.out.println("giridiğiniz sayı fibonacci dizisindedir");

        }
    }
}
