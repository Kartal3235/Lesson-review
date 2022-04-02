package day2;

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {

        /*
    Kullanici dan yas bilgisini alarak
	    oy kullanma yasi :
	 	age >= 18  ==> oy kullanmaya uygun
	 	age >= 70  ==> uc kez oy kullanabilir
	 	70 > age >=50 ==> iki kez oy kullanabilir
	 	50 > age >=18 ==> bir kez oy kullanabilir, yazdiriniz
	 */
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen yaşınızı giriniz:");
        int age=scan.nextInt();

        if(age>18){
            System.out.println("Yaşınız oy kullanmaya uygundur");

            if(age>=70){
                System.out.println("üç kez oy kullanabilirsiniz");
            }else if(age<70&&age>=50){
                System.out.println("iki kez oy kullanabilirsiniz");
            }else if(age<50&&age>=18){
                System.out.println("bir keaz oy kullanabilişrsiniz");
            }

        }else if (age>0&&age<18){
        System.out.println("Yasşınız oy kullanmaya müsait değil");


    }else{
            System.out.println("hatalı giriş yaptınız");
        }
}
}
