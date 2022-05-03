package day0305;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q2 {

    //Aşağıdaki multi dimensional array’in iç array’lerindeki tum elemanların
    //toplamını birer birer bulan ve herbir sonucu yeni bir array’in elemanı yapan
    // ve yeni array’i ekrana yazdıran bir program yazınız
    // Ornegin; { {1,2,3}, {4,5}, {6,7} } ==> 1+2+3=6  4+5=9  6+7=13 ==> output: {6, 9, 13}
    public static void main(String[] args) {

        int arr[][]={ {1,2,3}, {4,5}, {6,7} };
        int sum=0;
        int top[]=new int[arr.length];
        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j <arr[i].length ; j++) {
                sum=sum+arr[i][j];
            }
            top[i]=sum;
            sum=0;
        }
        System.out.println(Arrays.toString(top));

        List<Integer> yeniList=new ArrayList(Arrays.asList("{1,2,3}, {4,5}, {6,7})"));
        System.out.println("******");
        sayıTopla(yeniList);
    }

    public static void sayıTopla(List<Integer> yeniList){
        yeniList.stream().mapToInt(t->t+t).forEach(System.out::print);
    }

}
