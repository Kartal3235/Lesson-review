package kitapYönetimi;

public class EklenenKitaplar {

    String kitapAdi;
    int kitapNo;
    String yazarAdi;
    double kitapFiyatı;
    int baskıYılı;
    int sayfaSayisi;

    public EklenenKitaplar(String kitapAdi, String yazarAdi, double kitapFiyatı, int baskıYılı) {
        this.kitapAdi = kitapAdi;
        this.kitapNo = kitapNo;
        this.yazarAdi = yazarAdi;
        this.kitapFiyatı = kitapFiyatı;
        this.baskıYılı = baskıYılı;
        this.sayfaSayisi = sayfaSayisi;
    }

    public String getKitapAdi() {
        return kitapAdi;
    }

    public void setKitapAdi(String kitapAdi) {
        this.kitapAdi = kitapAdi;
    }

    public int getKitapNo() {
        return kitapNo;
    }

    public void setKitapNo(int kitapNo) {
        this.kitapNo = kitapNo;
    }

    public String getYazarAdi() {
        return yazarAdi;
    }

    public void setYazarAdi(String yazarAdi) {
        this.yazarAdi = yazarAdi;
    }

    public double getKitapFiyatı() {
        return kitapFiyatı;
    }

    public void setKitapFiyatı(double kitapFiyatı) {
        this.kitapFiyatı = kitapFiyatı;
    }

    public int getBaskıYılı() {
        return baskıYılı;
    }

    public void setBaskıYılı(int baskıYılı) {
        this.baskıYılı = baskıYılı;
    }

    public int getSayfaSayisi() {
        return sayfaSayisi;
    }

    public void setSayfaSayisi(int sayfaSayisi) {
        this.sayfaSayisi = sayfaSayisi;
    }

    @Override
    public String toString() {
        return "EklenenKitaplar{" +
                "kitapAdi='" + kitapAdi + '\'' +
                ", kitapNo=" + kitapNo +
                ", yazarAdi='" + yazarAdi + '\'' +
                ", kitapFiyatı=" + kitapFiyatı +
                ", baskıYılı='" + baskıYılı + '\'' +
                ", sayfaSayisi=" + sayfaSayisi +
                '}';
    }
}
