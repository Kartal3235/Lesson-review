package maps2;

import java.util.*;

import static java.time.chrono.JapaneseEra.values;

public class C04 {
    public static void main(String[] args) {

        Map<Integer, String>sinifListMap=C02_MapOluşturrr.myMap();
        System.out.println(sinifListMap);

        Set<Integer> sinifKeyList=sinifListMap.keySet();
        System.out.println(sinifKeyList);

        List<Integer> keyList=new ArrayList<>();

        keyList.addAll(sinifKeyList);
        System.out.println(keyList.get(1));

        //Şimdi de valuleri index'le ulaşabileceğimiz bir şekle sokalım

        Collection<String>sinifValueColl= sinifListMap.values();
        System.out.println(sinifValueColl);
        System.out.println(sinifValueColl.size());
        List<String>sinifValueList= new ArrayList<>();

        sinifValueList.addAll(sinifValueColl);
        System.out.println(sinifValueList);

        // Her bir Value birden fazla bilgiyi içeriyor
        // onun için valueleri MDA lere atmak mantıklı duruyor.
        // MDA oluşturmak için boyutlara ihityaçımız var

        int outerArrayBoyut=sinifValueList.size();
        System.out.println(outerArrayBoyut);

        // İnner arrraylaeın boyutubu bulmak biraz kompleks

        String ilkValue=sinifValueList.get(0);
        System.out.println(ilkValue);
        String ilkValueArray[]=ilkValue.split(", ");// Array e çevirdik.
        int innerArrayBoyut=ilkValueArray.length;

        String valueMDArr[][]=new String[innerArrayBoyut][outerArrayBoyut];

        for (int i = 0; i <outerArrayBoyut ; i++) {

            for (int j = 0; j <innerArrayBoyut ; j++) {

                String temp[]=sinifValueList.get(i).split(", ");

                valueMDArr[i][j]=temp[j];
            }
        }
        System.out.println(Arrays.deepToString(valueMDArr));

    }
}
