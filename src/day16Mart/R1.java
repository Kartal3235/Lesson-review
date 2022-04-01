package day16Mart;

import java.util.Scanner;

public class R1 {
    public static void main(String[] args) {


        // Bir metindeki unique karakterleri bulan bir kod yaziniz. Hello ==> Heo

        Scanner scan= new Scanner(System.in);
        System.out.println("Lütfen bir metin giriniz");
        String str=scan.next();

        for (int i = 0; i <str.length(); i++){


            if (str.indexOf(str.charAt(i))==str.lastIndexOf(str.charAt(i))){

                System.out.println(str.charAt(i));

            }



        }
    }
}
