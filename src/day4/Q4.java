package day4;

public class Q4 {
    public static void main(String[] args) {

       String isim="BAHADIR";
       String soyisim="KORAMAZ";
       String kKNO="123456789";

       isimSoyisimGizle(isim,soyisim);
        krediKartGizle(kKNO);

    }

    private static void krediKartGizle(String kKNO) {
        String yenikKNO="*** ***"+kKNO.substring(6);
        System.out.println(yenikKNO);
    }

    private static void isimSoyisimGizle(String isim, String soyisim) {
        String yeniİsim=isim.substring(0,1).toUpperCase()+isim.substring(1).replaceAll("\\S","*");
        String yeniSoyisim=soyisim.substring(0,1).toUpperCase()+soyisim.substring(1).replaceAll("\\S","*");
        System.out.println(yeniİsim);
        System.out.println(yeniSoyisim);
    }
}
