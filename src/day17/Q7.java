package day17;

public class Q7 {
    public static void main(String[] args) {
        // verilen 12345 sayısının rakamlarını yukarıdan aşağıya doğru yazdırınız
        // ex: input:
//		    output: 1
//		            2
//		            3
//		            4
//		            5


        System.out.println("1\n2\n3\n4\n5\n6\n");

        int sayi=12345;
        int birler=sayi%10;
        int onlar=sayi%10;
        int yüzler=sayi%10;
        int binler=sayi%10;

		/*
	    System.out.println(binler);
		System.out.println(yuzler);
		System.out.println(onlar);
		System.out.println(birler);
		 */

        // consolda alt satira yazdırmak için "\n"  komutu kullanılır.



    }
}