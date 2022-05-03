package day0305;

import java.util.Arrays;

public class Q3 {
        /* TASK :
         kullanıcıdan alınan bir  String'deki herbir  karakterin adedini bir array içinde yazdıran bir java programı yazın.
         String  "Javacilar cook afilli" ise cevap şöyle olmalıdır:
         { =2, a=3, r=1, c=1, v=1, o=2, f=1, l=2, J=1, i=2}
         */

    public static void main(String[] args) {

        String str= "Javacilar cook afilli";
        String str1[]=str.split("");
        System.out.println(Arrays.toString(str1));

        for (int i = 0; i <str1.length ; i++) {

            str1[i].charAt(0);
            for (int j = i; j <str1.length ; j++) {

                System.out.print(str1[j].charAt(0));
            }


            System.out.print(str1[i].charAt(0));


        }
    }
}
