package test;

import java.awt.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.lang.String;



public class UseArrayList2 {
    public static void main(String[] args) throws Exception, IndexOutOfBoundsException {

        ArrayList<Integer> alist = new ArrayList<>();

        alist.add(230);
        alist.add(240);
        alist.add(350);
        alist.add(579);
        alist.add(2);
        alist.add(899);

        System.out.println(alist);

        System.out.println(alist.get(1));

        System.out.println(" " + alist.remove(2));

        System.out.println(alist);

        System.out.println(alist.add(400));

        System.out.println(alist);

        System.out.println("Use of for-each loop: ");
        for (Integer in : alist) {
            System.out.println(in);
        }


        System.out.println("Use of iterator using while loop: ");
        Iterator it = alist.iterator();
        while (it.hasNext()) {
            Integer i = (Integer) it.next();
            System.out.print(i);
        }

        Collections.sort(alist);
        System.out.println(alist);
        List list = new ArrayList();
        list = alist;

        ConnectDB connectDB = new ConnectDB();

        connectDB.createTableFromStringToMySql("myFirst", "number");

        connectDB.InsertDataFromStringToMySql(list,"myFirst","number");

        List<String>numbers= connectDB.readDataBase("myFirst","number");
        for (String st:numbers){
            System.out.println(st);
        }





    }
}