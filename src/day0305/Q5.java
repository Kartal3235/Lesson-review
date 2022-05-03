package day0305;

import java.util.ArrayList;
import java.util.Scanner;

public class Q5 {
    /* TASK :
   Bir integer list oluşturunuz ve bu list’deki tum sayıların karesinin
   toplamını bulan code create ediniz.
    */
    public static void main(String[] args) {

        ArrayList<Integer>list=new ArrayList<>();
        Scanner scan= new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz:");
        int x=scan.nextInt();
        int toplam=0;
        for (int i = 1; i <=x ; i++) {

            toplam+=(i*i);

        }
        System.out.println(toplam);

        /* TASK :
         Bir String list oluşturunuz ve bu list’deki tum sayıların karesinin
        toplamını bulan code create ediniz.
    */
        System.out.println("\n*****");
        ArrayList<String>list1 = new ArrayList<>();
        Scanner scanner=new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz:");
        String islem=scanner.next();
       list1.add(islem);
       int sum = 0;
        for (String w:list1) {

            int a= Integer.parseInt(w);
            sum+=a*a;
        }
        System.out.println(sum);
    }
}
