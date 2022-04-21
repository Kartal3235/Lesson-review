package MapKullanımı;

import java.util.HashMap;
import java.util.Map;

public class Q1 {
    public static void main(String[] args) {

        Map map=new HashMap();
        map.put("bilim","12");
        map.put("sanat","13");
        map.put("edebiyat","5");
        map.put("siyaset","9");

        System.out.println(map);
        System.out.println("\t"+map);
    }

}
