package İnterface;

public class main {
    public static void main(String[] args) {

        kamyon kyn=new kamyon();
        kyn.fren(10);
        kyn.hız(50);
        kyn.vites(3);
        System.out.println("Kamyonun mevcut durumu:");kyn.printDurum();


        tır tır=new tır();
        tır.vites(5);
        tır.hız(70);
        tır.fren(20);
        System.out.println("tırın mevcut durumu:");tır.printDurum();
    }
}
