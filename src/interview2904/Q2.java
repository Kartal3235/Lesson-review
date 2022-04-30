package interview2904;

import java.util.LinkedHashMap;
import java.util.Map;

public class Q2 {
     /*
    10, Java
    20, PHP
    2,  Python
    57, C++
    89, C#
    40, Javascript
    Map kullanarak yazınız
     */
     public static void main(String[] args) {

         Map<Integer,String> program=new LinkedHashMap<>();

         program.put(10,"java");
         program.put(20,"php");
         program.put(2,"python");
         program.put(57,"c++");
         program.put(89,"c#");
         program.put(40,"javascript");

         System.out.println(program);

       // for (Integer w:program.keySet()// 1.yol sadece key den giderek yapıldı
       //      ) {
       //     System.out.println(w+" "+program.get(w));
       // }
         for (Map.Entry<Integer,String>w:program.entrySet()//2.yol Entry classından faydalanarak yapıldı
              ) {
             System.out.println(w.getKey()+","+w.getValue());
         }

     }
}
