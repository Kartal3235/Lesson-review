package day19;

import java.util.Scanner;

public class supper {
    public static void main(String[] args) {

        /*
         TASK :
        powerOfThree isminde bir Parametre olarak int Return tipi boolean method create edin.
        Bir tamsayı verildiğinde, 3 üssü olup olmadığını kontrol edin. 3'ün üssü(kuvveti) ise true, değilse false return edin.
        Örnek 1:
        input: 27
        output: true

        Örnek 2:
        Girdi: 0
        Çıktı: false

     */

        Scanner scan= new Scanner(System.in);
        System.out.println("Lütfen pozitif bir tamsayı giriniz:");
        int num=scan.nextInt();

        powerOfThree(num);
    }

    private static int powerOfThree(int num) {

        boolean b=false;
        int carpım=1;
        for (int i = 0; i <num; i++) {
            carpım=carpım*3;

            if(carpım==num){

                b=true;
                break;
            }



        }
        return carpım;
    }
}
