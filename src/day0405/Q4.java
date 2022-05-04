package day0405;

import java.util.Arrays;
import java.util.Scanner;

public class Q4 {
       /*  Write a Java program to get a String from user as input and find the maximumCounts occurring character in that string.
         (Ignore case sensitivity)

         Kullanicidan aldiginiz bir string icinde en cok tekrar eden karakteri yazdiran code create ediniz.
       input : Learning java is easy
       output: maximumCounts occurring character is : a
        */
       public static void main(String[] args) {



           Scanner scan= new Scanner(System.in);
           System.out.println("bir metin giriniz");
           String arr[]=scan.nextLine().split("");
           System.out.println(Arrays.toString(arr));
            String tekrareden="";
            int maxsayac=0;
           int sayac=0;
           for (int i = 0; i < arr.length ; i++) {
               for (int j = i+1; j < arr.length ; j++) {
                   if(arr[i].equalsIgnoreCase(arr[j])){
                       sayac++;
                       tekrareden=arr[i];
                   }

               }if(sayac>maxsayac){
                   tekrareden=arr[i];
                   maxsayac=sayac;

               }

           }
           System.out.println("sayac = " + sayac+"\ntekrareden harf= "+tekrareden);


       }
}
