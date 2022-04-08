package day9_inheritance;

import day8_inheritance.Parent;

public class Child extends Parent {


    // bir class ı child class yaptığımızda
    //parent class daki cons. ulaşması gerekir
    // bu durumda parent class daki cons.
    // acces modiferi public veya protected olmalıdır.


    // child class da tüm cons ilk satırına
    // java nın yerleştridiği cons PARAMETRESİZ DİR super()


    Child(){
       super();
        System.out.println("child class parametresiz cons.");
    }

    Child(int s){
        super();
        System.out.println("child class parametreli cons.");
    }

    Child(int sayi1,int sayi2){

        // Eğer parent class dan parametresiz con. değilde
        // baska bir cons. çalıştırmak isterseniz
        //bunu child class daki con. ilk satırına yazmalısınız
        super(sayi1, sayi2);
        System.out.println("iki parametreli cons.");
    }

    public static void main(String[] args) {

        Child child = new Child(5,8);

    }
}
