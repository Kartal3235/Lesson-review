package day2;

import java.util.Scanner;

public class Q8 {/*
		 * Kullanicidan ilk 3 buyuk harfden biri secildiginde cumle yazdiran kod yaziniz (switch case kullanin)
		 * ornek
		 *  Kullanici  : A , B , C harflerinden birini secsin
			 A'yi secmis ise, ==> Java is easy
			 B'yi secmis ise, ==> Java is fun
			 C'yi secmis ise, ==> I need to study :)
		 */

    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Lütfen harflerden birini seçiniz:\nA\nB\nC");
        char harfSecimi=scan.next().charAt(0);

        switch( harfSecimi ){

            case 'A':
                System.out.println("Java is easy");
                break;
                case 'B':
                    System.out.println("Java is fun");
                    break;
                    case 'C':
                        System.out.println("I neede to study");
                        break;
                        default:
                            System.out.println("Geçerli bir seçim yapınız");






        }
    }
}
