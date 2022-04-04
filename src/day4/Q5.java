package day4;

public class Q5 {
    public static void main(String[] args) {

        // Stringi yazdıran method oluşturalım

        //Hoşgeldiniz diyen bir method oluşturun

        // kapanma mesajı yazan bir method oluşturalım


        /*hoşgeldinYazdır();
        stringYazdır("Java gün geçtikçe güzelleşiyor");
        kapanmaMethodu();*/


        hosGeldiniz();
        kapanmaMethodu();
        yazdırMethodu();

    }

    private static void yazdırMethodu() {
        System.out.println("Java gün geçtikçe güzelleşiyor");
    }

    private static void kapanmaMethodu() {
        System.out.println("bizi tercih ettiğiniz için teşekkürler");
    }

    static void hosGeldiniz() {
        System.out.println("İş yerimize hoş geldiniz");
    }
}
