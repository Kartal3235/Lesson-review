package MapKullanımı;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Q2 {
    public static void main(String[] args) {


        List<Object> list=new ArrayList<>();
        list.add("Ergin");
        list.add(15);
        list.add(10.2);
        System.out.println(list);

        //list.set(1,(Integer)(list.get(1)))

        Map<Integer,String> sinifList = new HashMap<>();

        sinifList.put(101,"Ali,Can,Dev");
        sinifList.put(102,"Veli,Yan,Qa");
        sinifList.put(103,"Ali,Yan,Dev");

        System.out.println(sinifList);
        System.out.println(sinifList.keySet());
        System.out.println(sinifList.values());


    }
}
