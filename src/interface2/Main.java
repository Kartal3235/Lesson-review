package interface2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Çilek fiyatını hesaplamak için; 1\n"+"Armut fiyatı hesaplamak için; 2\n");
        int y= scan.nextInt();

        switch(y){

            case 1:
                cilek clk=new cilek();
                clk.meyveadi();
                System.out.println("kac kg çilek alındı");
               double n=scan.nextDouble();
                clk.alınankg(n);
                System.out.println("cileğin toplam fiyatı:"+clk.fiyat());
                break;

            case 2:
                armut armut=new armut();
                armut.meyveadi();
                System.out.println("kaç kg armut aldık:");
                n = scan.nextDouble();
                armut.alınankg(n);
                System.out.println("armutun toplam fiyatı:"+armut.fiyat());


                break;

        }
    }
}
