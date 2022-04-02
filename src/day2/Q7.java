package day2;

import java.util.Scanner;

public class Q7 {
    /*
    gunleri gösterebilen bir program yazın
    gun Pazartesi veya Sali ise:
    Java dersi gunleri
    gun Persembe veya Cuma ise:
    Selenyum dersi gunleri
    gun carsamba veya cumartesi ise:
    SQL dersi gunleri
    aksi halde: izin gunu
    (if deyimini KULLANMAYIN)
*/
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Lütfen bir gün giriniz:");
        String day=scan.next();

        switch(day) {

            case("pazartest"):
            case("salı"):
                System.out.println("Java dersleri");
                break;
            case("çarşamba"):
            case("cumartesi"):
                System.out.println("sql");
                break;

            case("perşembe"):
            case("cuma"):
                System.out.println("Selenyum");
                break;
            case("pazar"):
                System.out.println("Yatış");

        }
    }
}
