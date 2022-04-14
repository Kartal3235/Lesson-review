package dikdörtgen;

public class Q2 {

    Q1 obj1= new Q1(2,3);
    Q1 obj2=new Q1(6,5);



    public int cevreMethod(int arg1, int arg2) {

        int cevre = (obj1.getKisaKenar() + obj1.getUzunKenar()) * 2;
        return cevre;
    }

    public int alanMethod(int arg1, int arg2){

          int alan=(obj2.getKisaKenar())* obj2.getUzunKenar();
          return alan;
    }
}
