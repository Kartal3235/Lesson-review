package maps2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class C01_Map {
    public static void main(String[] args) {

        List<Object> list = new ArrayList<>();//daTA turu  object seçilirse her data türünden değer ekleyebiliriz
                                              // ancak bu dueumnda surekli casting problemleri ile karşılasabiliriz
        list.add("ergin");
        list.add(15);
        list.add(10.2);
        System.out.println(list);

       Map<Integer,String> siniflist=new HashMap<>();

       //bir sınıgfta öğrenci no ve isim,soyisim,branş olarak map oluşturmak istiyoruz

        siniflist.put(101,"Ali,Can,Dev");
        siniflist.put(102,"Veli,Yan,QA");
        siniflist.put(103,"Ali,Yan,C#");
        System.out.println(siniflist);
        System.out.println(siniflist.keySet());// key ler set olarak geliyorlar.
        System.out.println(siniflist.values());
    }
}
