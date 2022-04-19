package day20_interview;

public class Q2 {
    public static void main(String[] args) {

        /*
      AtbashCode ; bir metni şifrelemek veya şifresini çözmek için İbrani alfabesine temelli basit bir yöntemdir.
      Alfabenin ilk harfi son harfi yerine kullanilmaktadir..
      "abcdefghijklmnopqrstuvwxyz"; 26 harf
      "zyxwvutsrqponmlkjihgfedcba";
     */
        String ifade="abcdefghijklmnopqrstuvwxyz";

        int index='z'-ifade.charAt(1);
        System.out.println((char)(('a')+ index));

    }
}
