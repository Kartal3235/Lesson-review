package day5;

public class Q3 {
    public static void main(String[] args) {


        // 1 x 1 = 1
        // 1 x 2 = 2
        // 1 x 3 = 3
        // 1 x 4 = 4
        // 1 x 5 = 5
        // 1 x 6 = 6
        // 1 x 7 = 7
        // 1 x 8 = 8
        // 1 x 9 = 9
        // 1 x 10 = 10
        // Yukarıdaki çarpım tablosunu 10 a kadar ekrana yazdırınız.

        for (int i =0 ; i <=10 ; i++) {
            for (int j = 1; j <=10 ; j++) {
                System.out.println(i+"*"+j+"="+(i*j));

            }
            System.out.println();
        }
    }
}
