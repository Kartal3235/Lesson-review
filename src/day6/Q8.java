package day6;

import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
       // Kullanıcıdan pozitif bir tamsayı girmesini isteyen bir program yazın.
        // Daha sonra bu sayının çarpım tablosunu yazdırmalıdır.

        Scanner scan = new Scanner(System.in);
        System.out.println("tam sayı giriniz:");
        int input= scan.nextInt();


        for (int i = 0; i <10 ; i++) {
            System.out.println(input+"*"+i+"="+(input*i));

        }
    }
}
