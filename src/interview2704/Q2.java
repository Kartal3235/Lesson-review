package interview2704;

import java.util.*;

public class Q2 {
    // create a list of numbers 1, 3, 1, 2, 4, 5, 3 --> 2 duplicates
    // count how many duplicates we have
    // find out what are the duplicated values

    // 1, 3, 1, 2, 4, 5, 3 sayılarının bir listesini oluşturun --> 2 kopya
    // kaç tane tekraralı eleman olduğunu sayin
    // yinelenen değerlerin ne olduğunu öğrenin
    public static void main(String[] args) {

        List<Integer>numbers=new ArrayList(Arrays.asList(1,3,1,2,4,5,3));
        int tekrarlıElemanSayisi=0;

        Set<Integer> uniqeElemanlar=new HashSet<>();//uniq değerlerden oluştuğu için set oluşturduk,burda sırada önemli değil
        List<Integer>tekrarlıElemanlar=new ArrayList<>();

        for (int i = 0; i <numbers.size();  i++) {

            boolean ekliMi=uniqeElemanlar.add(numbers.get(i));//ekli olma durumunu uniqeEelemanlarda var olmasıdır.
            if(!ekliMi){// uniqe elemanlara eklenmediyse o eleman duplicate dir.
                tekrarlıElemanSayisi++;// bu durumda duplicate sayısı 1 artar
                tekrarlıElemanlar.add(numbers.get(i));//duplicate olan bu eleman tekrarliElemanlar listesine eklenir.

            }
        }
        System.out.println("tekrarlı elemanların sayısı: "+tekrarlıElemanSayisi);
        System.out.println("tekrarlı elemanlar: "+tekrarlıElemanlar);

    }
}
