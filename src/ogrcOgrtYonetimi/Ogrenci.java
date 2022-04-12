package ogrcOgrtYonetimi;

public class Ogrenci extends Kisi{

   private String numara;
   private String sınıfBilgileri;

   public Ogrenci(){

   }

    public Ogrenci(String adSoyad, String kimlikNo, int yas, String numara, String sınıfBilgileri) {
        super(adSoyad, kimlikNo, yas);
        this.numara = numara;
        this.sınıfBilgileri = sınıfBilgileri;
    }

    public String getNumara() {
        return numara;
    }

    public void setNumara(String numara) {
        this.numara = numara;
    }

    public String getSınıfBilgileri() {
        return sınıfBilgileri;
    }

    public void setSınıfBilgileri(String sınıfBilgileri) {
        this.sınıfBilgileri = sınıfBilgileri;
    }

    @Override
    public String toString() {
        return "Ogrenci{" +
                "numara='" + numara + '\'' +
                ", sınıfBilgileri='" + sınıfBilgileri + '\'' +
                '}';
    }
}
