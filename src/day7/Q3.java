package day7;

import java.util.Arrays;

public class Q3 {
    public static void main(String[] args) {
        /*  you have a string "HeySiri"
         * with arrays change it to "ByeSiri" and write changing array
         *(String iniz: "HeySiri"  Diziyi "ByeSiri" ye cevirin )
         *
         */

        String str ="HeySiri";
        str=str.replaceAll("Hey","Bye");

        String arr[]=new String[1];
        arr[0]=str;
        System.out.println(Arrays.toString(arr));
    }
}
