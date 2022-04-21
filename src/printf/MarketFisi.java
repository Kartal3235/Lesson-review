package printf;

public class MarketFisi {
    public static void main(String[] args) {

        String urun[]={"Domates","Biber","patlıcan","elma","armut"};
        double brFiyat[]={2.3,2.29,4.1,2,3};
        double miktar[]={1,2,3.5,2.5,6};

        System.out.println("Ürün       miktar  br_fiyat  urun_top");
        System.out.println("=====================================");

        for (int i = 0; i <urun.length ; i++) {

            System.out.printf("%-8s  %5.1fkg  £%-5.2f  £%-5.2f\n",urun[i],miktar[i],brFiyat[i],miktar[i]*brFiyat[i]);

        }
        System.out.println("=====================================");
        double toplamUrunMiktarı=0;
        for (int i = 0; i <miktar.length ; i++) {
            toplamUrunMiktarı+=miktar[i];

        }
        double toplamOdenecekFiyat=0;
        for (int i = 0; i <miktar.length ; i++) {
            toplamOdenecekFiyat+=miktar[i]*brFiyat[i];

        }
        System.out.printf("Genel Toplam %5.2fkg      £%5.2f",toplamUrunMiktarı,toplamOdenecekFiyat);
    }
}
