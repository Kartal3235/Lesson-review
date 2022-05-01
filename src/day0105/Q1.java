package day0105;

import java.util.ArrayList;
import java.util.Arrays;

public class Q1 {

    /*  TASK :
     *  verilen bir int  Arrayde toplamlari istenen degere esit olan sayi ciftlerini
     * yazdiran bir method yaziniz int[] arr= {5,7,-6,4,2,15,3,8,1};
     * int istenenToplam=9;
     */
    public static void main(String[] args) {

       /* int[] arr= {5,7,-6,4,2,15,3,8,1};
        int istenenToplam=9;

        for (int i = 0; i <arr.length ; i++) {
            for (int j = i+1; j <arr.length ; j++) {

                if( arr[i]+arr[j] ==istenenToplam){
                    System.out.println(arr[i] +" ile " +arr[j]+ " toplamı: "+istenenToplam);
                }
            }

        }*/
        int[] arr= {5,7,-6,4,2,15,3,8,1};
        istenenDgrEştOlanSylr(arr);
        
    }
    public static void istenenDgrEştOlanSylr(int[] arr){
        
        ArrayList<Integer> yeniList= new ArrayList(Arrays.asList(arr));
        yeniList.stream().filter(t->(t+t)==9).forEach(System.out::print);
    }
    
}
