package day5;

import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        /*
	 	Get the number of rows and columns from user.
	 	Create a rectangle.
	 	rows = 3 and column = 5 ==> * * * * *
	 	                            * * * * *
	 	                            * * * * *
	 */
        Scanner scan= new Scanner(System.in);
        System.out.println("lütfen satır sayısını giriniz.");
        int satır = scan.nextInt();
        System.out.println("lütfen sütun sayısını girniz:");
        int sütun = scan.nextInt();

        for (int i = 1; i <=satır ; i++) {
            for (int j = 1; j <sütun ; j++) {
                System.out.print("*");
                
            }
            System.out.println("*");
        }
    }
}
