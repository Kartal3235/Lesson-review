package day14_interview;

public class Q1 {
    /*
	Problem Tanımı :
	farklı 4 öğrencinin sırasıyla 6,4,3 ve 5 yazılı notlarının ortalamasını
	yazdıran parametreli method yazınız
 */
    public static void main(String[] args) {

        ortalamaBul("ali",55,60,71,82,75,69);
        ortalamaBul("ayşe",55,60,71,82);
        ortalamaBul("ahmet",55,60,71);
        ortalamaBul("hsan",60,71,82,75,69);
    }

    private static void ortalamaBul(String isim, double ...notlar) {
        double toplam=0;

        for (double each:notlar) {

            toplam+=each;

        }
        System.out.println(isim+"-> not ortalaması:"+toplam/notlar.length);
    }
}
