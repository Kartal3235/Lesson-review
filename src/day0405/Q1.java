package day0405;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Q1 {

    /* TASK :
     * Verilen arraydeki tekrar eden sayilari, ilki haric silip, tekrarsiz
     * sayilardan olusan bir array haline getiren bir code create ediniz.
     *
     * INPUT : {1,2,2,3,1,4,2,5,6,8,7,5,9,1}
     * OUTPUT : [1,2,3,4,5,6,7,8,9]
     */
    public static void main(String[] args) {

        int arr[]={1,2,2,3,1,4,2,5,6,8,7,5,9,1};
        ArrayList<Integer> list1=new ArrayList<Integer>();

        for (Integer w :arr) {
            if(!list1.contains(w)){
                list1.add(w);
            }
        }
        System.out.println(list1);
        System.out.println("\n****");



        int tekrarsızList[]=new int[list1.size()];

    }


}
