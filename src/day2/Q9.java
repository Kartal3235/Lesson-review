package day2;

import java.util.Scanner;

public class Q9 {

    // Girilen uc haneli bir sayının okunusnu yazı ile yazdırınız

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen 3 basamaklı bir sayı giriniz: ");
        int sayi1=scan.nextInt();

        int birlerBasamagı=sayi1%10;
        int onlarBasamagı=(sayi1/10)%10;
        int yüzlerBasamagı=sayi1/100;

        if(sayi1>99&&sayi1<1000){
            switch(yüzlerBasamagı){

                case 0:
                    System.out.println("");
                    break;
                case 1:
                    System.out.println("yüz");
                    break;
                    case 2:
                        System.out.println("ikiyüz");
                        break;
                        case 3:
                            System.out.println("üçyüz");
                            break;
                            case 4:
                                System.out.println("dörtyüz");
                                break;
                                case 5:
                                    System.out.println("beşyüz");
                                    break;
                                    case 6:
                                        System.out.println("altı yüz");
                                        break;
                                        case 7:
                                            System.out.println("yediyüz");
                                            break;
                                            case 8:
                                                System.out.println("sekizyüz");
                                                break;
                                                case 9:
                                                    System.out.println("dokuzyüz");
                                                    break;






            }



        }


    }
}


