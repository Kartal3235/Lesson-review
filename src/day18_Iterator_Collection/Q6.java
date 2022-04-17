package day18_Iterator_Collection;

import java.util.LinkedList;

public class Q6 {
    public static void main(String[] args) {
        // hem list hemde Queue nun child classıdır.
        LinkedList<Integer>list=new LinkedList<>();

        list.add(5);
        list.add(10);// add methodu List den geldiği için hep sona ekler
        list.addFirst(11);
        list.addLast(12);
        list.add(3,15);

        System.out.println(list);

    }
}
