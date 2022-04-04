package day7;

import java.util.Arrays;
import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {

//			Kullanıcıyakaçelemanlıbir array gireceğinisorun.
//			Kullanıcıdan array’in elemanlarınıgirmesiniisteyin.
//			a) Bu array’in tumelemanlarınıekranayazdırın.
//			b) Buarayın son elemanınıilkelemanyapınvetumelemanlarınıekranayazdırın.
//			Mesela; array {1, 2, 3} iseekrana {3, 1, 2} seklindeyazdırın

            Scanner scan= new Scanner(System.in);
        System.out.println("kaç eleman gireceksiniz:");
        int elemanSayisi= scan.nextInt();
        System.out.println("lütfen arrayin elemanlarını oluşturun:");
        int arr[]=new int[elemanSayisi];

        for (int i = 0; i <elemanSayisi ; i++) {
            arr[i]=scan.nextInt();

        }
        System.out.println(Arrays.toString(arr));

        int arrNew[]=new int[elemanSayisi];
        for (int i = 0; i <elemanSayisi ; i++) {
            arrNew[i-1]=arr[i];
        }
    }
}
