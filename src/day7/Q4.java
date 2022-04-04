package day7;

public class Q4 {
    public static void main(String[] args) {

        /*
         * verilen Arrayde toplamlari istenen degere esit olan sayi ciftlerini //
         * yazdiran bir method yaziniz int[] arr= {5,7,-6,4,2,15,3,8,1}; int
         * istenenToplam=9;
         */

        int[] arr= {5,7,-6,4,2,15,3,8,1};
        int istenenToplam=9;
        tpMeth(arr,istenenToplam);
    }

    private static void tpMeth(int[] arr, int istenenToplam) {

        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j < arr.length ; j++) {

                if(arr[i]+arr[j]==istenenToplam){

                    System.out.println(arr[i]+"ve"+arr[j]+"toplam : "+istenenToplam);
                }
                
            }

        }
    }
}
