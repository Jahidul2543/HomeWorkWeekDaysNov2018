package test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class DemoBasicHashMap4 {

    public static void main(String[] args) {


        HashMap<Integer, String> hmap = new HashMap<>();

        hmap.put(1,"Arnob");
        hmap.put(2,"Sheikh");
        hmap.put(3,"Ope");
        hmap.put(4,"Mango");
        hmap.put(5,"Grapes");

        Set s = hmap.entrySet();
        Iterator it = s.iterator();
        while (it.hasNext())
            System.out.println(it.next());

hmap.remove(3);

        System.out.println(hmap);

        Set s2 = hmap.entrySet();
        Iterator it2 = s2.iterator();
        while(it2.hasNext()){
            System.out.println(it2.next());
        }


    }

}
