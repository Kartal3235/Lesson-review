package day0405;

import java.util.ArrayList;
import java.util.Arrays;

public class Q3 {
    /* TASK :
     * 10 elamanli bir list olusturun. Ardindan dizinin 3. elemani ile
     * 8. elemaninin yerlerini degistirin.
     *
     * ORNEK:
     *
     * INPUT : String[] isimler={"Umit","Emin","Kemal","Kerem","Taylan","Orhan","Sinan","Furkan","Ahmet","Ali"};
     * OUTPUT : String[] isimler={"Umit","Emin","Furkan","Kerem","Taylan","Orhan","Sinan","Kemal","Ahmet","Ali"};
     */
    public static void main(String[] args) {

        ArrayList<String>isimler=new ArrayList<>(Arrays.asList("Umit","Emin","Kemal","Kerem","Taylan","Orhan","Sinan","Furkan","Ahmet","Ali"));
        String eleman3=isimler.get(2);
        String eleman8=isimler.get(7);

        isimler.set(2,eleman8);
        isimler.set(7,eleman3);
        System.out.println(isimler);


    }
}
