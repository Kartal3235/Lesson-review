package day21_interview;

import java.util.Random;

public class Q4 {
    public static void main(String[] args) {

        //    ||This Part Should be in Main Method||
        //
        //     -Create an array of size 5, assign some random values from 0 to 10
        //     -(use random class and for loop to assign values)
        //
        //
        //    ||You should create public static void methods fori loop (Parameter should be int Array for methods)||
        //
        //     -1-Create a method that prints array like "2 3 1 10 2", space between elements of array
        //     -2-Create a method that prints the sum of an array
        //     -3-Create a method that prints the max element of an array
        //
        //    P.S: Return type should be void because we are not returning anything just printing


        Random rand = new Random();
        int[]sayilar=new int[5];

        for (int i = 0; i <sayilar.length ; i++) {

            sayilar[i] = rand.nextInt(10);//arrayın elemanlarına 0-10 arası sayı verir.

        }
        printArray(sayilar);
        printSum(sayilar);
        printMaxValue(sayilar);


    }

    private static void printArray(int[] sayilar) {

        for (int i = 0; i <sayilar.length ; i++) {
            System.out.print(sayilar[i]+" ");

        }


    }

    private static void printSum(int[] sayilar) {

        int toplam=0;
        for (int i = 0; i < sayilar.length ; i++) {

            toplam=toplam+sayilar[i];


        }System.out.print("toplam="+toplam+" ");
    }

    private static void printMaxValue(int[] sayilar) {

        int MaxValue =sayilar[0];//sayılar 0 ıncı index e bakıyoruz 8,maxvalue=8;
                                // for a girdik, sayilar[1]=3, Math.max(3,8)==>8 i alır

        for (int i = 1; i < sayilar.length ; i++) {

            MaxValue=Math.max(sayilar[i],MaxValue);


        } System.out.println("i="+MaxValue);
    }
}
