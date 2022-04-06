package day8_inheritance;

public class Ustabası extends Isci{
    @Override
    public String toString() {
        return "Ustabası{" +
                "IsciStatu='" + IsciStatu + '\'' +
                ", saatUcreti=" + saatUcreti +
                ", statu='" + statu + '\'' +
                ", maas=" + maas +
                ", persNo=" + persNo +
                ", isim='" + isim + '\'' +
                ", soyisim='" + soyisim + '\'' +
                ", adres='" + adres + '\'' +
                ", tel='" + tel + '\'' +
                '}';
    }

    public static void main(String[] args) {

        Ustabası ustabası1=new Ustabası();

        ustabası1.saatUcreti=15;
        ustabası1.isim="Murat";
        ustabası1.soyisim="Gökçe";
        ustabası1.maas= ustabası1.maasHesapla();
        ustabası1.statu="Isci";
        System.out.println(ustabası1);


    }
}
