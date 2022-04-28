package LambdaExampla;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q1 {


    public static void main(String[] args) {




        List<Integer> sayi=new ArrayList<>(Arrays.asList(34,22,16,11,35,20,63,21,65,44,66,64,81,38,15));

        printElstructured(sayi);
        System.out.println("\n  ****  ");
        printElstructured1(sayi);
        System.out.println("\n  ****  ");
        listElCiftPrint(sayi);
        System.out.println("\n  ****  ");
        listElCiftPrint1(sayi);
        System.out.println("\n  ****  ");
        listElOtzKckCft(sayi);
        System.out.println("\n  ****  ");
        listelOtzBykCft(sayi);

//task: Structured Programing kullanarak list elemanlarını aralarında boşluk olacak şekilde print ediniz.

    }
    public static void printElstructured(List<Integer> sayi){

        for (Integer w:sayi) {
            System.out.print(w+" ");

        }

    }
    //task: Functions Programing kullanarak list elemanlarını aralarında boşluk olacak şekilde print ediniz.

    public static void printElstructured1(List<Integer>sayi){

        sayi.stream().forEach(t-> System.out.print(t+" "));
        sayi.stream().forEach(System.out::print);

    }
    //task bir boşluk bırakarak yazdırma methodu oluştur.

    public static void yazdir(int a){

        System.out.print(a+ " ");
    }
    //structured Programming ile list elemanlarının çift olmalarını aynı satırda aralarına boşluk bırakarak print ediniz

    public static void listElCiftPrint(List<Integer>sayi){

        for (Integer w:sayi
             ) {
            if(w%2==0){
                System.out.print(w+" ");
            }
        }
    }
    //Functional Programming ile list elemanlarının çift olmalarını aynı satırda aralarına boşluk bırakarak print ediniz

    public static void listElCiftPrint1(List<Integer>sayi){

        sayi.stream().filter(t->t%2==0).forEach(Q1::yazdir);
    }
    //Fuctional Programming ile list elemanlarının 34 de küçük çift olmalarını aynı satırda aralarına boşluk bırakarak print edin
    public static void listElOtzKckCft(List<Integer>sayi){

        sayi.stream().filter(t->t%2==0&& t<34).forEach(Q1::yazdir);
    }
    //Fuctional Programming ile list elemanlarının 34 den büyük veya çift olmalarını aynı satırda aralarına boşluk bırakarak print edin

    public static void listelOtzBykCft(List<Integer>sayi){

        sayi.stream().filter(t->t>34||t%2==0).forEach(Q1::yazdir);
    }
}
