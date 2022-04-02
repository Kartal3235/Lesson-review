import java.util.Scanner;

public class Q7 {

    // Kullanicidan alacaginiz bir stringde bosluk karakterinin olup olmadigini kontrol ediniz.
    // Kullanicidan alacaginiz bir stringin bos olup olmadigini kontrol ediniz.


    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Lütfen bir string giriniz:");
        String str1= scan.nextLine();
        int bosluk=str1.indexOf(" ");

        if(bosluk==-1) {

            System.out.println("Stringde boşluk yoktur");
        }else{
            System.out.println("boşluk vardır");
        }
    }
}
