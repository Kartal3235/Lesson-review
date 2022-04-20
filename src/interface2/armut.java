package interface2;

public class armut implements meyve{

     double n;
     double kgfiyat=10.79;

    // meyvenin aadını yazdıracak method
    @Override
    public void meyveadi() {
        System.out.println("Armut");
    }
    // alınan kilogramı belirleyen method
    @Override
    public void alınankg(double n) {
        this.n = n;

    }
    // fiyatımızı döndüren method
    @Override
    public double fiyat() {
        return n*fiyat();
    }
}
