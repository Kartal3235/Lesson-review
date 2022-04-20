package İnterface;

public class kamyon implements arac{
    @Override
    public void vites(int a) {
        vites+=a;
    }

    @Override
    public void hız(int b) {
        hız+=b;
    }

    @Override
    public void fren(int c) {
    fren-=c;
    }

    int vites;
    int hız;
    int fren;

    public void printDurum(){

        System.out.println("Kamyonun durumu:"+"vites:"+vites+"hız:"+hız+"fren:"+fren);
    }
}

