package day16Mart;

import java.util.Arrays;

public class R5 {
    public static void main(String[] args) {


        //Soru 1:
        //Elemanlari “Ali” , “Veli”, “Ayse” ve “Fatma” olan bir array olusturun ve bu
        //array’i yazdirin.

        String arr[]=new String[4];
        arr[0]="Ali";
        arr[1]="Veli";
        arr[2]="Ayşe";
        arr[3]="Fatma";

        String arr1[]={"Ali","Veli","Ayşe","Fatma"};

        System.out.println(Arrays.toString(arr1));
        //Soru 1’deki elemanlardan “Ali” yerine “Can”, “Ayse” yerine “Gul” atayin.

        arr1[0]="Can";
        arr1[2]="Gul";

        System.out.println(Arrays.toString(arr1));


        //Soru 1:
        //Verilen 3 elemanli bir array’in tum elemanlarini bir soldaki konuma tasiyacak bir
        //program yazin. Ornek; array [1,2, 3] ise output [2, 3, 1] olacak.

        int arr2[]={1,2,3};
        int[] arr3 = new int[3];
        arr3[0]= arr2[1];
        arr3[1]=arr2[2];
        arr3[2]=arr2[0];
        System.out.println(Arrays.toString(arr3));

        //Soru 2:Verilen bir array’in tum elemanlarini toplayan bir program yazalim.


        int number[]={1,2,3,4,5,6,7,8,9,0};

        Arrays.sort(number);

        System.out.println(Arrays.binarySearch(number,10));

        String letters[]={"A","d","e","b","c"};

        Arrays.sort(letters);
        System.out.println(Arrays.toString(letters));

        int arr0[]={4,1,3,2,0};
        int arr4[]={2,1,4,3,0};

        Arrays.sort(arr0);
        Arrays.sort(arr4);

        System.out.println(Arrays.toString(arr0));

        System.out.println(Arrays.equals(arr0, arr4));

        String str="Java öğrenmek, IT alanında yer edinmektir.";

        String arr7[]=str.split(",");

        System.out.println(Arrays.toString(arr7));

        String arr8[]=str.split("");
        System.out.println(Arrays.toString(arr8));














    }
}
