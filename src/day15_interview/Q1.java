package day15_interview;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {

        //Get String from user and print just vowels(aeiou) inside String on the console
        Scanner scan= new Scanner(System.in);
        System.out.println("bir String giriniz:");
        String str=scan.nextLine().toLowerCase();

        // 1.yol
        int index = 0;//while loop start condition
        while(index<str.length()){

            char c = str.charAt(index++);// str nin her bir indeki karakteri char olarak c variable 'ına ata
            if(c=='a'|| c=='e'|| c=='i'|| c=='o'|| c=='u'){
                System.out.print(c);
            }
        }
        System.out.println("***********-2.yol-*********");
        String s=str.replaceAll("[^aeiou]","");//[]: içerisindeki butun karakterlere işlem yapar
                                                                // ^: yanındaki karakterlerin dısında olanları alır
        System.out.println(s);
    }
}
