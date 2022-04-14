package dikdörtgen;

public class Q1 {

/*Not: 1. Ve 2 soru için tek bir main ve tek bir proje yapısı kullanınız.
Dikdörtgen şekline ait değerleri saklayabilecek ve bu değerlere göre hesaplamalar yapabilecek bir sınıf yazın.
 Bu sınıfın tüm üye verileri private, tüm üye fonksiyonları da public etiketi altında yer almalıdır.
 Buna göre, boyutları (3,4) ve (5,6) olan iki dikdörtgen oluşturun.
 Bu dikdörtgenlerin çevrelerini ve alanlarını hesaplayıp ekranda yazdırabilecek uygun fonksiyonları sınıfa yerleştirin ve çalışmasını gösterin.
 Not: 3 Farklı kaynak dosyası oluşturunuz, int main () fonksiyonunun çalıştığı dosyada herhangi bir sınıf oluşturmayınız. Sadece çağırma işlemlerini yapınız.

 */
    private int uzunKenar;
    private int kisaKenar;

    public Q1(){

    }
    public Q1(int uzunKenar, int kisaKenar) {
        this.uzunKenar = uzunKenar;
        this.kisaKenar = kisaKenar;
    }

    public int getUzunKenar() {
        return uzunKenar;
    }

    public int setUzunKenar(int uzunKenar) {

        this.uzunKenar = uzunKenar;
        return uzunKenar;
    }

    public int getKisaKenar() {

        return kisaKenar;
    }

    public int setKisaKenar(int kisaKenar) {

        this.kisaKenar = kisaKenar;
        return kisaKenar;
    }

    @Override
    public String toString() {
        return "Q1{" +
                "uzunKenar=" + uzunKenar +
                ", kisaKenar=" + kisaKenar +
                '}';
    }
}
