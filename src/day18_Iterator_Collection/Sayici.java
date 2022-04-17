package day18_Iterator_Collection;

public class Sayici {
    int sayac=0;
    Sayici(){
        sayac++;
        System.out.println(sayac);

    }

    public static void main(String[] args) {
        Sayici nesne1=new Sayici();
        Sayici nesne2=new Sayici();
        Sayici nesne3=new Sayici();
    }

}
