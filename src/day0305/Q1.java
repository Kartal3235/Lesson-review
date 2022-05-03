package day0305;

import java.util.Arrays;

public class Q1 {

    //Aşağıdaki mutli dimensional array'lerin iç array'lerinde
    // aynı indexe sahip elamanların toplamını yazdıran bir program yazın.
    // arr1[]={{1,2},{3,4,5}{6}}
    // arr2[]={{7,8,9},{10,11},{12}}
    public static void main(String[] args) {

        int arr1[][]={{1,2},{3,4,5},{6}};

        int arr1top=0;
        int arrAt[]=new int [1];//[1] burda uzunluğu veriyor
        for (int i = 0; i < arr1.length ; i++) {
            for (int j = 0; j <arr1[i].length ; j++) {

               arr1top+=arr1[i][j];
            }
            arrAt[0]=arr1top;
            //[0]->burda ise index veriliyor

        }
        System.out.println(arr1top);
        System.out.println(Arrays.toString(arrAt));

        int arr2[][]={{7,8,9},{10,11},{12}};
        int arr2Topla=0;
        int[]arr2At=new int[1];
        for (int i = 0; i <arr2.length ; i++) {
            for (int j = 0; j <arr2[i].length ; j++) {

                arr2Topla+=arr2[i][j];
            }
            arr2At[0]=arr2Topla;
        }
        System.out.println(arr2Topla);
        System.out.println(Arrays.toString(arr2At));

    }
}
