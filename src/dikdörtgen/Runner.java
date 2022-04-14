package dikdörtgen;

import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {


        Q1 obj2=new Q1();
        Q2 obj1 = new Q2();


        System.out.println("Çevre= "+obj1.cevreMethod(obj2.setKisaKenar(3), obj2.setUzunKenar(4)));
        System.out.println("Alan= "+obj1.alanMethod(obj2.setKisaKenar(5),obj2.setUzunKenar(5)));

    }
}
