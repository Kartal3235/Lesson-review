package day11_interview;

import java.util.Scanner;

public class Q4 {

    // STRING OLAN PIN kodunuzu kontrol eden bir kod yazınız.
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String pin="asd.1234";
        int girişHakkı=4;

        System.out.println("***********Hoşgeldiniz**********");


        for (int i = 1; i <4 ; i++) {
            System.out.print("Pin kodu giriniz:");
            String girilenPin= scan.nextLine();

            if(pin.equals(girilenPin)){
                System.out.println("girilen pin başarılıdır");
                break;
            }else {
                System.out.println("yanlış giriş yaptınız");
                girişHakkı--;
                System.out.println("kalan giriş hakkınız:"+girişHakkı);
            }if(girişHakkı==0){
                System.out.println("giriş hakkınız kalmadı.. sim bloke oldu");
                break;

            }
        }


    }
}
