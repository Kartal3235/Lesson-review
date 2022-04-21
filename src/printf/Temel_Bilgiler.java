package printf;

public class Temel_Bilgiler {
    public static void main(String[] args) {

        int sayi=123;
        String str="Bahadırhan koramaz";
        double dob=1.0208256179;

        System.out.printf("sayi: %10d,str: %.10S, dou: %-7.3f",sayi,str,dob);

    }
}
