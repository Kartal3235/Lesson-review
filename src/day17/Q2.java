package day17;

public class Q2 {
    public static void main(String[] args) {

        int a=15;
        int b=++a;
        System.out.println(b);

        b=a++;// önce assigne daha sonra arttırma olur
              // burda b nin değeri 16
              // a nın değeri ise 17 olur

        System.out.println(b);
        System.out.println(a);

        int sayi1=10;
        int sayi2=20;
        int sayi3=30;

        sayi2=sayi1++;// ilk önce sayi2 ye değer atanacak
                      // daha sonra sayi1 değeri 1 arttırılacak

        System.out.println(sayi1+" , "+sayi2);

        sayi3=++sayi1;// önce sayi1 1 artacak
                      // daha sonra sayi3 e atama yapılacak


        System.out.println(sayi1+", "+sayi3);

        System.out.println(sayi3++);// ilk önce yazdıracak(12), daha sonra arttırma yapacak 33. satırda (13) yazacak

        System.out.println(--sayi3);// yukarda daha sonradan arttırma yaptığından dolayı sayi3=13 oldu
                                    // 1 azaltıldığından dolayı sayi3=12 olacak

        System.out.println(--sayi3);// ilk önce azaltma daha sonra atama olur
                                    // sayi3=11


    }
}
