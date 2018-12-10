package test;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class DemoCollectionInterfaces {
    public static void main(String[] args) {

        List myList = new LinkedList();
        myList.add(new Integer(3));
        myList.add(new Integer(4));
        myList.add("End");

Integer x = (Integer) myList.iterator().next();

       for (Object t: myList) {
           System.out.println(t);
       }

List <Integer> genericList = new LinkedList<Integer>();
       genericList.add(5);
       genericList.add(6);

        Integer y = genericList.iterator().next();

        System.out.println(y);


    }
}
