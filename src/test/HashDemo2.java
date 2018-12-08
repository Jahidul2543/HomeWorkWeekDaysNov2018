package test;

import java.util.*;
import java.util.List;
import java.util.ArrayList;
import java.lang.Exception;

public class HashDemo2 {
    public static void main(String[] args) throws IndexOutOfBoundsException, Exception {

        ArrayList<Integer> arList = new ArrayList<>();

        arList.add(309);
        arList.add(400);
        System.out.println(arList);

        System.out.println(" ");
        for (Integer jn : arList) {
            System.out.println(jn);
        }

        Iterator it = arList.iterator();
        while (it.hasNext()) {
            Integer i = (Integer) it.next();
            System.out.println(i);
        }

        Collections.sort(arList);
        System.out.println(arList);
        List list = new ArrayList();
        list = arList;

        ConnectDB connectDB =new ConnectDB();

        connectDB.createTableFromStringToMySql("MySecond","Number");
        connectDB.InsertDataFromArrayListToMySql(list,"MySecond","Number");

        List<String>numbers = connectDB.readDataBase("MySecond","Number");

    }
}