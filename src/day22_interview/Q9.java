package day22_interview;

public class Q9 {
    public static void main(String[] args) {

        /*
        Print even numbers from 20 to 0 but do not
        use decrement (i--).
         */
        int sayi=0;
        for (int i = 20; i >0 ; i--) {
            if(i%2==0){
                 sayi=i;
                System.out.print(sayi+" ");
            }

        }
    }
}
