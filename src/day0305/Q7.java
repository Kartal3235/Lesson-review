package day0305;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Q7 {
     /* TASK :
        Kullanıcıdan alacağınız 6 elemanlı bir dizinin
        sadece tek elemanlarını ayrı diziye bir metodda atayarak
         yazdırınız.

        */
     public static void main(String[] args) {

        int arr[]=new int[6];
        Scanner scan= new Scanner(System.in);

         for (int i = 0; i <6 ; i++) {
             System.out.println("lütfwn bir sayı giriniz:");
             arr[i]= scan.nextInt();

         }
         System.out.println(Arrays.toString(arr));

         System.out.println(tekSayLi(arr));

     }

    private static ArrayList<Integer> tekSayLi(int[] arr) {
         ArrayList<Integer>arr2=new ArrayList<Integer>();

          arr2= (ArrayList<Integer>) Arrays.stream(arr).filter(t->t%2!=0);
          return arr2;
    }

}
