package İnterface;

public class Islem implements Ex1{
    @Override
    public void toplama(int x, int y) {
        System.out.println("x ve y değerlerinin toplamı:"+(x+y));

    }

    @Override
    public void cıkarma(int x, int y) {
        System.out.println("x ve y değerlerinin farkı:"+(x-y));

       }

    @Override
    public void hacimBulma(int x, int y, int z) {
        System.out.println("x,y ve z değerleirne sahip şeklin hacmi:"+(x*y*z));

    }

    @Override
    public void ortalamaBul(int a, int b) {
        System.out.println("a ve b değerlerinin ortalaması:"+(a+b)/2);
    }

    public static void main(String[] args) {
        Islem i = new Islem();
        i.cıkarma(6, 5);
        i.toplama(12, 15);
        i.hacimBulma(5, 8, 7);
        i.ortalamaBul(8, 9);

    }
}
