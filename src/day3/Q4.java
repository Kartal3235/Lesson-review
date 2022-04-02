package day3;

import java.util.Scanner;

public class Q4 {

    /*
     * girilen String icinde "xyz" dizimi var ise true degilse false return eden metod yaziniz
     *
     * input      output
     * axyzm  ==   true
     * xyz    ==   true
     * x.yz   ==   false
     * xyaz   ==   false
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen string bir ifade giriniz:");
        String str = scan.next();
        boolean xyziceriyorMu=false;

        if(str.contains("xyz")){
            xyziceriyorMu=true;
            System.out.println(xyziceriyorMu);

        }else {
            System.out.println(xyziceriyorMu);
        }
    }
}
