package day17;

public class Q8 {
    public static void main(String[] args) {
        System.out.println("-------------------Arttırma");
        int a = 1;
        System.out.println("a : "+(++a)); //2
        System.out.println("a : "+(a++)); //2
        System.out.println("a : "+a);  //3

        a=5;
        System.out.println("son hali :"+(a++ + ++a)) ;
        // 5 + 7 = 12


        System.out.println("-------------------Azaltma");
        int b = 5;
        System.out.println(--b);  //4
        System.out.println(b--);  //4
        System.out.println(b);  //3


        System.out.println("-------------SORU1-----------------");
        int x = 20;
        int y = 15;

        System.out.println(++x + --y);  //21 + 14 =35  x= 21   y=14
        System.out.println(x);
        System.out.println(y);

        System.out.println("-----------------------------------");
        System.out.println(++x + y--);  // 21 + 15=36  x=21 y=14
        System.out.println(x);
        System.out.println(y);

    }
}
