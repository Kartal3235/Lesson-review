package interface2;

public class cilek implements meyve{

     double n;
     double kgfiyat=6.99;
    // meyve adını yazdıracak method
    @Override
    public void meyveadi() {
        System.out.println("çilek");
    }
    // alınan kilogramı belirleycek method
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
