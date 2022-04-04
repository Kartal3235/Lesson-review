package day4;

import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {

        /*
      Problem Tanımı :
      Basit 4 islem yapan bir hesap makinesi kodlayiniz....
      Kullanicidan yapacagi islemi islem sembolu ile secmesini saglayalinız.
      Kullanicidan iki sayi girmesini isteyiniz.
      Girilen iki sayi ve secilen isleme gore dogru sonucu ekrana yazdirınız.
    */
        Scanner scan= new Scanner(System.in);
        System.out.println("dört işlem için simgelerden birini seçiniz: +,-,*,/");
        char islem=scan.next().charAt(0);

        System.out.println("birinci sayıyı giriniz:");
        double num1= scan.nextDouble();

        System.out.println("ikinci sayıyı giriniz:");
        double num2= scan.nextDouble();

        hesapMakinası(islem,num1,num2);

    }

    private static void hesapMakinası(char islem, double num1, double num2) {


        if(islem=='+'||islem=='-'||islem=='*'||islem=='/'){

            switch(islem){
                case '+':
                    System.out.println("toplam:"+(num1+num2));
                    break;
                    case '-':
                        System.out.println("çıkarma:"+(num1-num2));
                        break;
                        case '*':
                            System.out.println("çarpma:"+(num1*num2));
                            break;
                            case '/':
                                System.out.println("bölme:"+(num1/num2));
                                break;
                default:
                    System.out.println("hatalı giriş yaptınız");

            }
        }else{
            System.out.println("hatalı giriş yaptınız");
        }
    }
}
