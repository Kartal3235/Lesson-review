package day21_interview;

import java.util.Arrays;

public class Q5 {
    public static void main(String[] args) {

        // Print 2D String array using loops( 2 boyutlu string array kullanarak yazdırın)

        String [][]arr={{"abc","def","ghi"},{"jkl","mno","prs"}};// strin double array oluşturduk

        for (int i = 0; i <arr.length ; i++) {// outer array

            for (int j = 0; j <arr[i].length ; j++) {//inner array

                System.out.println(arr[i][j]);// sadece elemanları yazdırır.

            }

        }
        System.out.println(Arrays.deepToString(arr));// ***deepToString*** çok boyutlu arrayleri dizi olarak yazdırır.
    }
}
