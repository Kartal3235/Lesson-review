package İnterface;

import java.util.Random;

public class ayBulma2 implements Ex2{
    public static void main(String[] args) {

        Random rand = new Random();
        int ay=rand.nextInt(6);
        System.out.println("Gelen ay numarası="+ay);

        switch(ay){

            case Ex2.ocak:
                System.out.println("Ocak ayı seçildi:"+ocak);
                break;
            case Ex2.subat:
                System.out.println("Subat ayı seçildi:"+subat);
                break;
            case Ex2.mart:
                System.out.println("Mart ayı seçildi:"+mart);
                break;

            case Ex2.nisan:
                System.out.println("Nısan ayı seçildi:"+nisan);
                break;

            case Ex2.mayıs:
                System.out.println("Mayıs ayı seçildi:"+mayıs);
                break;

            case Ex2.haziran:
                System.out.println("Haziran ayı seçildi:"+haziran);
                break;
            default:
                System.out.println("tekrar deneyiniz");
                break;
        }
    }
}
