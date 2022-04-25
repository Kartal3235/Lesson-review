package day22_interview;

public class obebokek {
    public static void main(String[] args) {
        /*Kullanıcıdan 2 tamsayı girmesini ve ardından GCD (En Büyük Ortak Bölen) ve 
        LCM'yi (En Küçük Ortak Kat) bulmasını isteyin.
         */
        
        int sayi1=30;
        int sayi2=90;
        int obeb=0;
        for (int i = 1; i <sayi1 ; i++) {

            if(sayi1%i==0&&sayi2%i==0){
                obeb=i;

            }


        }int okek=(sayi1*sayi2)/obeb;
        System.out.println(okek);
        System.out.println(obeb);
    }
}
