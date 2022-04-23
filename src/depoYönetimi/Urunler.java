package depoYönetimi;

import java.util.HashMap;
import java.util.Map;

public class Urunler{

    public static Map<Integer,String> urunListesi=new HashMap<>();

    //id urunIsmi uretici miktar birim ve raf

     private int urunid;
     private String urunIsmı;
     private String urunUretici;
     private String miktar;
     private String urunBirim;
     private int raf;

     private int urunAdedi;
     private int urunrafNumarası;

     //urunTanimlama 	==>  urunun ismi, ureticisi ve birimi girilecek. id  alınacak.

    public Urunler(){

    }

    public Urunler(String urunIsmı,String urunUretici,String urunBirim,int urunid){
        this.urunIsmı=urunIsmı;
        this.urunUretici=urunUretici;
        this.urunBirim=urunBirim,
        this.urunid=urunid;

        urunListesi.put(urunid,"urunUretici,urunBirim,urunIsmı");

    }
    //urunListele 	==> tanimlanan urunler listelenecek. urunun adeti ve raf numarasi tanimlama yapilmadiysa default deger gorunsun.

    public Urunler(int urunid,String urunIsmı,String urunUretici,String urunBirim,int urunAdedi,int urunrafNumarası){
        this.urunid = urunid;
        this.urunIsmı=urunIsmı;
        this.urunUretici=urunUretici;
        this.urunBirim=urunBirim;
        this.urunAdedi=urunAdedi,
        this.urunrafNumarası=urunrafNumarası;

    }

    public int getUrunid() {
        return urunid;
    }

    public void setUrunid(int urunid) {
        this.urunid = urunid;
    }

    public String getUrunIsmı() {
        return urunIsmı;
    }

    public void setUrunIsmı(String urunIsmı) {
        this.urunIsmı = urunIsmı;
    }

    public String getUrunUretici() {
        return urunUretici;
    }

    public void setUrunUretici(String urunUretici) {
        this.urunUretici = urunUretici;
    }

    public String getMiktar() {
        return miktar;
    }

    public void setMiktar(String miktar) {
        this.miktar = miktar;
    }

    public String getUrunBirim() {
        return urunBirim;
    }

    public void setUrunBirim(String urunBirim) {
        this.urunBirim = urunBirim;
    }

    public int getRaf() {
        return raf;
    }

    public void setRaf(int raf) {
        this.raf = raf;
    }

    public int getUrunAdedi() {
        return urunAdedi;
    }

    public void setUrunAdedi(int urunAdedi) {
        this.urunAdedi = urunAdedi;
    }

    public int getUrunrafNumarası() {
        return urunrafNumarası;
    }

    public void setUrunrafNumarası(int urunrafNumarası) {
        this.urunrafNumarası = urunrafNumarası;
    }

    @Override
    public String toString() {
        return "Urunler{" +
                "urunid=" + urunid +
                ", urunIsmı='" + urunIsmı + '\'' +
                ", urunUretici='" + urunUretici + '\'' +
                ", miktar='" + miktar + '\'' +
                ", urunBirim='" + urunBirim + '\'' +
                ", raf=" + raf +
                ", urunAdedi=" + urunAdedi +
                ", urunrafNumarası=" + urunrafNumarası +
                '}';
    }
}
