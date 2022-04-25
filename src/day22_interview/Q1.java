package day22_interview;

import java.util.Arrays;
import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        /*
     Kullanicidan bir String aliniz.
     String'de var olan her character'in sayisini ekrana yazdiriniz.
     Ornek: alacan ==> a = 3, l = 1, c = 1, n = 1
            abaa   ==> a=3  b=1
    */
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen bir string ifade giriniz:");
        String str=scan.nextLine();

        String strarr[]=str.split("");// her karakteri böldük
        System.out.println(Arrays.toString(strarr));

        Arrays.sort(strarr);// harfleri sıraladık
        System.out.println(Arrays.toString(strarr));

        int count=0;
        for (int i = 1; i <strarr.length; i++){

            if(strarr[i-1].equals(strarr[i])){
                count++;

            }else {
                System.out.println(strarr[i-1]+ "= sayıysı  =" +(count+1));
                count=0;

            }
            if(i==strarr.length-1){

               System.out.println(strarr[i]+" sayısı "+(count+1));
            }

        }






    }
}
