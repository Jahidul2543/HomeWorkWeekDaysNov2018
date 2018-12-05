package test;

import java.util.HashMap;
import java.util.Map;

public class HashDemo {

    static void printFreq(int arr[]) {
        HashMap<Integer, Integer> hmap = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {

            Integer c = hmap.get(arr[i]);
            if (hmap.get(arr[i]) == null)
                hmap.put(arr[i], 1);
            else
                hmap.put(arr[i], ++c);
        }

            for(Map.Entry m: hmap.entrySet())
            System.out.println("Frequency of "+m.getKey()+" is "+m.getValue());



    }

    public static void main(String[] args) {
        int arr[]={1, 4,7,4,7,6,1,4,1,6};
        printFreq(arr);

    }
}