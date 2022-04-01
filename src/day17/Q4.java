package day17;

public class Q4 {
    public static void main(String[] args) {

        // primitive data turu ile non primitive data türü arasındaki farklar?

        String str="Java";
        int sayi=10;

        System.out.println(str.toUpperCase());

        Short sayi1=20;
        Short sayi2=30;

        sayi1=sayi2;// wrapper class ile aynı isimdeki primitive data turu arasında geçiş olabilir
        System.out.println(sayi1);

        System.out.println(Short.BYTES);







    }
}
