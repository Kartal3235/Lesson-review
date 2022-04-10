package day12_interview;

import java.util.Arrays;

public class Q1 {
    public static void main(String[] args) {
         /*
		// Stringi ters cevirmek icin bir Java Programi yazin
		//1.Yol: StringBuilder () kullanarak
		//2.Yol: String Classini kullanarak
		//3.Yol: Bir method olusturun, ardindan methodu main method dan cagirin
    */
        //1.Yol: StringBuilder () kullanarak
        String input ="Hava çok güzel";
        StringBuilder str = new StringBuilder();
        str.append(input);// bu method stringBuılder a ekleme yapar.
        String reverseInput = str.reverse().toString();
        System.out.println("1.yol:"+reverseInput);

        //2.Yol: String Classini kullanarak
        System.out.print("2.yol");

        for (int i = input.length()-1; i >=0 ; i--) {// son karakterden başla,ilk karaktere kadar git..

            System.out.print(input.charAt(i));//her bir karakteri yazdır.

        }
        System.out.println("*********************");
        //3.Yol: Bir method olusturun, ardindan methodu main method dan cagirin

        System.out.print("3.yol");
        inputTersCevir(input);



    }

    private static void inputTersCevir(String input) {

        char arr[]=input.toCharArray();

        System.out.println(Arrays.toString(arr));

        for (int i = input.length()-1; i >=0 ; i--) {

            System.out.print(arr[i]);

        }



    }
}
