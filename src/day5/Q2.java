package day5;

public class Q2 {
    public static void main(String[] args) {
        // 0-255 e kadar olan harflerin , sayı ve harf değerini ekrana yazdırınız.

        /*for (int i = 0; i <255 ; i++) {
            char karakter=(char)i;
            System.out.println(i+"==>"+karakter);

        }*/

        int i=0;
        while(i<255) {
            char karakter=(char)i;
            System.out.println(i+" "+karakter);
            i++;

        }
    }
}
