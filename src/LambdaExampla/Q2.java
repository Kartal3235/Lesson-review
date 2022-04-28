package LambdaExampla;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class Q2 {
    public static void main(String[] args) {

        List<Integer> sayi1=new ArrayList<>(Arrays.asList(2,5,7,9,-5,14,18));

        ListCftKare( sayi1);
        System.out.println("\n  ****  ");
        ListTekElKupBırFzl(sayi1);
        System.out.println("\n  ****  ");
        ListCftElKareKok(sayi1);
        System.out.println("\n  ****  ");
        ListEnEL(sayi1);
        System.out.println("\n  ****  ");
        CftElKareEnB(sayi1);
        System.out.println("\n  ****  ");
        tekElKareEn(sayi1);
        System.out.println("\n  ****  ");
        TumElToplPrint(sayi1);
        System.out.println("\n  ****  ");
        cftElCrpPrint(sayi1);
        System.out.println("\n  ****  ");

    }

// Task : Functional Programming ile listin cift elemanlarinin  karelerini ayni satirda aralarina bosluk bırakarak print ediniz

    public static void ListCftKare( List<Integer> sayi1){

        sayi1.stream().filter(t->t%2==0).map(t->(t*t)).forEach(Q1::yazdir);

        /*
        map()-> Stream içerisindeki elemanları başka tiplere dönüştürmek veya
        üzerlerinde işlem yapmak için map kullanılmaktadır.
         */
    }
 // Task : Functional Programming ile listin tek elemanlarinin  kuplerinin bir fazlasini ayni satirda aralarina bosluk birakarak print edi

    public static void ListTekElKupBırFzl(List<Integer> sayi1){

        sayi1.stream().filter(t->t%2!=0).map(t->(t*t*t)+1).forEach(Q1::yazdir);
    }
// Task : Functional Programming ile listin cift elemanlarinin   karekoklerini ayni satirda aralarina bosluk birakarak yazdiriniz

    public static void ListCftElKareKok(List<Integer> sayi1){

        sayi1.stream().filter(t->t%2==0).map(t->Math.sqrt(t)).forEach(t-> System.out.println(t+" "));

    }
 // Task : list'in en buyuk elemanini yazdiriniz

    public static void ListEnEL(List<Integer> sayi1){

        Optional<Integer> maxsayi1=sayi1.stream().reduce(Math::max);

        System.out.println(sayi1.stream().reduce(Math::max));
    }
    // Task : List'in cift elemanlarin karelerinin en buyugunu print ediniz
    public static void CftElKareEnB(List<Integer>sayi1){

        sayi1.stream().filter(t->t%2==0).map(t->(t*t)).reduce(Math::max);
        System.out.println( sayi1.stream().filter(t->t%2==0).map(t->(t*t)).reduce(Math::max));
    }
// Task : List'in tek elemanlarin karelerinin en kucuğu print ediniz
    public static void tekElKareEn(List<Integer>sayi1){

        sayi1.stream().filter(t->t%2!=0).map(t->(t*t)).reduce(Math::min);
        System.out.println(sayi1.stream().filter(t->t%2!=0).map(t->(t*t)).reduce(Math::min));
    }

// Task : List'teki tum elemanlarin toplamini yazdiriniz.

    public static void TumElToplPrint(List<Integer>sayi1){

        System.out.println(sayi1.stream().reduce(0, (a, b) -> (a + b)));
        sayi1.stream().reduce(Integer::sum);
    }
  // Task : List'teki cift elemanlarin carpimini  yazdiriniz.
    public static void cftElCrpPrint(List<Integer>sayi1){

        System.out.println(sayi1.stream().filter(t -> t % 2 == 0).reduce(1, (x, y) -> (x * y)));
    }

    }
