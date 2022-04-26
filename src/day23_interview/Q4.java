package day23_interview;

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
         /*
		// Stringi ters cevirmek icin bir Java Programi yazin
		//1.Yol: StringBuilder () kullanarak
		//2.Yol: String Classini kullanarak
		//3.Yol: Bir method olusturun, ardindan methodu main method dan cagirin
    */
      String input="all is well";
     // StringBuilder str = new StringBuilder();

     // str.append(input);
     // System.out.println(str);
     // str.reverse();
     // System.out.println(str);

      Scanner scan= new Scanner(System.in);
      System.out.println("ifadeyi yazdırın :");
      String ifadeyi=scan.nextLine();

        for (int i = ifadeyi.length()-1 ; i >=0 ; i--) {
            System.out.print(input.charAt(i));// her bir karakteri yazdırır.

        }

        System.out.println("\n******************");
        ınputTersYazdırma(input);
    }

    private static void ınputTersYazdırma(String input) {

        char []arr=input.toCharArray();
        System.out.println(arr);
        for (int i = input.length()-1; i >=0 ; i--) {

            System.out.println(arr[i]);
        }

    }

}
