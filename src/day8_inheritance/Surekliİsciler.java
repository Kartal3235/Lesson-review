package day8_inheritance;

public class Surekliİsciler extends Isci{
    @Override
    public String toString() {
        return "Surekliİsciler{" +
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


        Surekliİsciler surİc1=new Surekliİsciler();
        surİc1.persNo=5001;
        surİc1.isim="Cem";
        surİc1.soyisim="Akay";
        surİc1.statu="Isci";
        surİc1.saatUcreti=11;
        surİc1.maas= surİc1.maasHesapla();

        System.out.println(surİc1);
    }
}
