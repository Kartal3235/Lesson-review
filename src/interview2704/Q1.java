package interview2704;

public class Q1 {
    // create a method that accepts an int
    // and returns twice of that int
    // overload this method with wrapper class: Integer

    // int kabul eden bir metot yarat
    // ve bu int'nin iki katını döndürür
    // bu yöntemi wrapper sınıfıyla overload et : Integer

    public static void main(String[] args) {

        twice(5);
        System.out.println("primitve data type: "+twice(5));//primitve data type: 10
        Integer sayi=10;
        System.out.println("non primitive data tyype: "+twice(sayi));//non primitive data tyype: 20
    }

    private static int twice(int sayi) {

        return sayi*2;
    }

    private static Integer twice(Integer sayi) {

        return sayi*2;
    }
}
