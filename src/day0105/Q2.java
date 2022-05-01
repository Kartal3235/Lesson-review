package day0105;

public class Q2 {
    /* TASK :
        arr1 = { {1,2}, {3,4,5}, {6} }  ve  arr2 = { {7,8,9}, {10,11}, {12} }  veriliyor.
        Bu iki array'in tum elemanlarinin toplamini bulan programi yaziniz.
         */
    public static void main(String[] arg){
        int [][] arr1 = { {1,2}, {3,4,5}, {6} };

        int toplam=0;
        for (int i = 0; i <arr1.length; i++) {
            for (int j = 0; j <arr1[i].length ; j++) {

                toplam=toplam+arr1[i][j];

            }
        }

        int [][]arr2 = { {7,8,9}, {10,11}, {12} };
        int toplam2=0;
        for (int i = 0; i <arr2.length ; i++) {
            for (int j = 0; j <arr2[i].length ; j++) {

                toplam2+=arr2[i][j];
            }

        }
    }



}
