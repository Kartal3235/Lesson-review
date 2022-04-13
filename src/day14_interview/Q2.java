package day14_interview;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {

     /*
        create one int
        do while int is less then 100
        print the number
        increment by 5
        for example: 0   5   10  15  20
     */

    Scanner scan= new Scanner(System.in);
    int sayi=scan.nextInt();

    do{
        System.out.print(sayi+" ");
        sayi+=5;// increment değeri
    }while (sayi<100);//şartımız var
    }

}
