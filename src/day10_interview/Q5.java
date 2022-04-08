package day10_interview;

import java.util.Arrays;
import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {

          /*
 Create a function that takes an array and the difference between the largest
 and the smallest numbers.
 Ask user to enter array elements.
    kullanıcının girdigi bir array'in en buyuk elemani ile
    en kucuk elemanının  farkını bulan bir method create ediniz.
 */

        arrayolustur();


    }

    private static void arrayolustur() {
        Scanner scan=new Scanner(System.in);
        System.out.println("arrayın uzunluğunu girin");
        int uzunluk=scan.nextInt();
        int arr[]=new int[uzunluk];

        for (int i = 0; i <uzunluk ; i++) {
            System.out.println("arayın "+(i+1)+"inci elemanını giriniz");
            arr[i]=scan.nextInt();

        }
        Arrays.sort(arr);
        System.out.println("arr[uzunluk-1]-arr[0]:"+(arr[uzunluk-1]-arr[0]));
    }
}
