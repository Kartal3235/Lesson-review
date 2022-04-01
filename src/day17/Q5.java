package day17;

public class Q5 {
    public static void main(String[] args) {


        String str1="12345";
        String str2="23456";

        // verilen iki string deki sayıları toplayın????

        System.out.println(str1+str2);

        System.out.println(Integer.valueOf(str1)+Integer.valueOf(str2));

        int sayi3=Integer.valueOf(str1);

        System.out.println(sayi3);

        // Integer.valueof(str1) methodu sadece sayısal değer içeren String lerde kullanılabilir
        // bir tane bile sayi dişindda karakter olursa java hata verir.

    }
}
