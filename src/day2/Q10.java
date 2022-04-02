package day2;

import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {


        // Girilen uc haneli bir sayının onlar basamağının değerini yazı ile yazdırınız.

        Scanner scan= new Scanner(System.in);
        System.out.println("Lütfen üç basamaklı bir sayı giriniz: ");
        int sayi1=scan.nextInt();

        int onlarBasamagı=(sayi1/10)%10;

        switch(onlarBasamagı) {
            case 0:
                System.out.println("sıfır");
                break;
                case 1:
                    System.out.println("on");
                    break;
                    case 2:
                        System.out.println("yirmi");
                        break;
                        case 3:
                            System.out.println("otuz");
                            break;
                            case 4:
                                System.out.println("kırk");
                                break;
                                case 5:
                                    System.out.println("elli");
                                    break;
                                    case 6:
                                        System.out.println("altmış");
                                        break;
                                        case 7:
                                            System.out.println("yetmiş");
                                            break;
                                            case 8 :
                                                System.out.println("seksen");
                                                break;
                                                case 9:
                                                    System.out.println("doksan");
                                                    break;

                                                    default:
                                                        System.out.println("hatalı giriş yaptınız");


        }

    }
}
