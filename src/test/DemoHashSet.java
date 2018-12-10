package test;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class DemoHashSet {
    public static void main(String[] args) {

        HashSet<String> hset = new HashSet<>();
        hset.add("Me");
        hset.add("you");

        System.out.println(hset);


        LinkedHashSet<Integer> lHashSet = new LinkedHashSet<>();
        lHashSet.add(10);

        System.out.println(lHashSet);



    }
}
