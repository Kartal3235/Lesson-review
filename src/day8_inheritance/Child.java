package day8_inheritance;

public class Child extends Parent {

    Child(int sayi){


    }


    Child(){
        this(6);
        System.out.println("Child cons.çalıştı");

    }

    public static void main(String[] args) {

        Child child = new Child();
    }
}
