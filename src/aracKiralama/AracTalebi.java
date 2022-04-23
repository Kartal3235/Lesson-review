package aracKiralama;

public class AracTalebi {

    private String model;
    private String marka;
    private String yakıttipi;
    private double gunlukUcret;


    private String alacagıGunu;
    private double alacagıSaat;


    private String teslımGunu;
    private double teslimSaati;

    public AracTalebi(String alacagıGunu, double alacagıSaat, String teslımGunu, double teslimSaati){
        this.alacagıGunu = alacagıGunu;
        this.alacagıSaat = alacagıSaat;
        this.teslımGunu = teslımGunu;
        this.teslimSaati = teslimSaati;

    }
    public AracTalebi(String model,String marka,String yakıttipi,double gunlukUcret){
        this.marka=marka;
        this.model=model;
        this.yakıttipi=yakıttipi;
        this.gunlukUcret=gunlukUcret;


    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getYakıttipi() {
        return yakıttipi;
    }

    public void setYakıttipi(String yakıttipi) {
        this.yakıttipi = yakıttipi;
    }

    public double getGunlukUcret() {
        return gunlukUcret;
    }

    public void setGunlukUcret(double gunlukUcret) {
        this.gunlukUcret = gunlukUcret;
    }

    public String getAlacagıGunu() {
        return alacagıGunu;
    }

    public void setAlacagıGunu(String alacagıGunu) {
        this.alacagıGunu = alacagıGunu;
    }

    public double getAlacagıSaat() {
        return alacagıSaat;
    }

    public void setAlacagıSaat(double alacagıSaat) {
        this.alacagıSaat = alacagıSaat;
    }

    public String getTeslımGunu() {
        return teslımGunu;
    }

    public void setTeslımGunu(String teslımGunu) {
        this.teslımGunu = teslımGunu;
    }

    public double getTeslimSaati() {
        return teslimSaati;
    }

    public void setTeslimSaati(double teslimSaati) {
        this.teslimSaati = teslimSaati;
    }

    @Override
    public String toString() {
        return "AracTalebi{" +
                "model='" + model + '\'' +
                ", marka='" + marka + '\'' +
                ", yakıttipi='" + yakıttipi + '\'' +
                ", gunlukUcret=" + gunlukUcret +
                ", alacagıGunu='" + alacagıGunu + '\'' +
                ", alacagıSaat=" + alacagıSaat +
                ", teslımGunu='" + teslımGunu + '\'' +
                ", teslimSaati=" + teslimSaati +
                '}';
    }
}
