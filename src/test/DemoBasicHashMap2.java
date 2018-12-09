package test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class DemoBasicHashMap2 {
    public static void main(String[] args) {
        HashMap<Integer, String> hmap = new HashMap<Integer, String>();

        hmap.put(1, "Arnob");
        hmap.put(2, "Seikh");
        hmap.put(3, "Ope");
        hmap.put(4, "Mango");
        hmap.put(5, "Apple");

        System.out.println(hmap);


        hmap.remove(1);


        System.out.println(hmap);
        hmap.put(1, "Ghost");

        System.out.println(hmap.get(3));
        System.out.println(hmap.size());
        System.out.println(hmap.containsKey(2));

        Set set = hmap.entrySet();

        Iterator it = set.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        String var = hmap.get(4);
        System.out.println(var);
        hmap.remove(3);
        Set s2 = hmap.entrySet();
        Iterator it2 = s2.iterator();
        while (it2.hasNext()) {
            System.out.println(it2.next());


        }
    }
}