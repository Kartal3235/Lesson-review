package dikdörtgen;

import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        Q1 obj2=new Q1();
        Q2 obj1 = new Q2();


        System.out.println("Çevre= "+obj1.cevreMethod(obj2.setKisaKenar(scan.nextInt()), obj2.setUzunKenar(scan.nextInt())));
        System.out.println("Alan= "+obj1.alanMethod(obj2.setKisaKenar(scan.nextInt()), obj1.setUzunKenar(scan.nextInt())));

    }
}
