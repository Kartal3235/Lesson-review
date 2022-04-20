package İnterface;

public class tır implements arac {


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

    public int getHız() {
        return hız;
    }

    public void printDurum(){

        System.out.println("Tırın durumu:"+vites+", hız:"+hız+"fren"+fren);
    }
}
