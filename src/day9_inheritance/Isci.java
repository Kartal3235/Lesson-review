package day9_inheritance;

public class Isci extends Muhasebe{
    Isci() {
        super();
        System.out.println("ısci cons. çalıştı");
    }

    public static void main(String[] args) {
        Isci isci = new Isci();
    }
}
