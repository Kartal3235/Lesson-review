package day22_interview;

import java.util.Arrays;
import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {

        /*
        Write a code that returns the duplicate chars in a String array.(interview Question)
        Bir String dizisinde yinelenen karakterleri döndüren bir kod yazın
        String str=“Javaisalsoeasy”
         */

        /*Scanner scan= new Scanner(System.in);
        System.out.println("bir ifade giriniz");
        String str= scan.nextLine();
        System.out.println("bir karakter giriniz:");
        char ch=scan.next().charAt(0);
        harfBulma(str,ch);

        int count=0;
        for (int i = 1; i <str.length() ; i++) {
            if(str.charAt(i-1)=='a'&&str.charAt(i)=='z'){
                count++;
            }

        }
        System.out.println(count);
    }

    private static void harfBulma(String str, char ch) {

        int count = 0;
        for (int i = 0; i <str.length() ; i++) {
            if(str.charAt(i)==ch){

                count++;
            }

        }*/
        /*
        Write a code that returns the duplicate chars in a String array.(interview Question)
        Bir String dizisinde yinelenen karakterleri döndüren bir kod yazın
        String str=“Javaisalsoeasy”
         */
        String str="Javaisalsoeasy";
        char ch[]=str.toCharArray();
        System.out.println(Arrays.toString(ch));


        for (int i = 0; i <str.length() ; i++) {

            for (int j =i+1 ; j <str.length() ; j++) {
                if(ch[i]==ch[j]){
                    System.out.print(ch[j]);
                    break;



                }



            }
        }

    }
}
