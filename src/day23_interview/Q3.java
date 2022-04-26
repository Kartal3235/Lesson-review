package day23_interview;

import java.util.Arrays;
import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {

         /*
 Create a function that takes an array and the difference between the largest
 and the smallest numbers.
 Ask user to enter array elements.
    kullanıcının girdigi bir array'in en buyuk elemani ile
    en kucuk elemanının  farkını bulan bir method create ediniz.
 */
        Scanner scan= new Scanner(System.in);
        System.out.println("array uzunluğu giriniz");
        int uzun=scan.nextInt();
        int arr[]=new int[uzun];

        for (int i = 0; i <uzun ; i++) {
            System.out.println("arrayin "+(i+1)+" inci elemanını giriniz");
            arr[i]=scan.nextInt();
        }
        Arrays.sort(arr);
        System.out.println("arrayin max ve min değerleri farkı: "+(arr[uzun-1]-arr[0]));

    }
}
