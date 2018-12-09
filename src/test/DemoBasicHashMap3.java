package test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;


public class DemoBasicHashMap3 {
    public static void main(String[] args) {
        HashMap<Integer, String> hmap = new HashMap<>();

        hmap.put(1, "Arnob");
        hmap.put(2, "Sheikh");
        hmap.put(3,"Mango");

        Set s = hmap.entrySet();
        Iterator it = s.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        System.out.println(hmap.get(3));
        Set s2 =hmap.entrySet();
        Iterator it2=s2.iterator();
        while (it2.hasNext()) {
            Map.Entry mEntry = (Map.Entry) it2.next();
            System.out.println(mEntry.getKey());
            System.out.println(mEntry.getValue());
        }


    }
}
