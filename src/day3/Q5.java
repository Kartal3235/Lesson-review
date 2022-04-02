package day3;

import java.util.Scanner;

public class Q5 {

    /*
		name1 ve name2 degiskenlerini olusturun.
		name1 degiskeninin karakter sayisi cift ise kelimenin ortasina name2 yi yerlestirin.
		name1 degiskeninin karakter sayisi tek ise "name1 cift sayili olmadigi icin ortasina yerlestiremedik" yazdirin.
		          e.g:
		         name1= mehmet
		         name2= ahmet
		         Print ==> mehahmetmet
		*/
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen 1. ismi giriniz:");
        String str1= scan.nextLine();
        System.out.println("Lütfen 2. ismi giriniz:");
        String str2= scan.nextLine();

        if(str1.length()%2==0){
            System.out.println(str1.substring(0, str1.length()/2).concat(str2).concat(str1.substring(str1.length()/2)));
        }else{
            System.out.println("İsim çift haneli olmadığı için ortasında birşey yerleştiremedik");
        }
    }
}
