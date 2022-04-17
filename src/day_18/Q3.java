package day_18;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {

        // Kullanıcının yasadıgı güne  göre 100 gün sonra hangi gün olduğunuz yazdırınız.
        // pazartesi hafta başlangıcı

        Scanner scan = new Scanner(System.in);
        System.out.println("1-Pazartesi\n2-Salı\n3-Çarşamba\n4-Peerşembe\n5-Cuma\n6-Cumartesi\n7-Pazar+");
        int kacıncıGun = scan.nextInt();


        if (kacıncıGun <= 0 || kacıncıGun > 7) {
            System.out.println("hatalı veri girdiniz");


        } else {

            System.out.println("kaç gün sonrasını öğrenmek istiyorsunuz");
            int kacGunSonrasını = scan.nextInt();


           }
    }
}