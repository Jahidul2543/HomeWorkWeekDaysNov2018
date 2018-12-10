package test;

import com.mysql.cj.x.protobuf.MysqlxDatatypes;
import java.lang.IndexOutOfBoundsException;
import java.util.*;
import java.util.ArrayList;
public class DemoDrive2 {

    public static void main(String[] args) throws Exception, IndexOutOfBoundsException {

        ArrayList<String> list2 = new ArrayList<>();
        list2.add( "Arnob");
        list2.add( "Sheikh");
        list2.add( "Ope");
        list2.add("Ghani");
        list2.add("Arman");
        list2.add( "Dipu");
        list2.add( "Sabbir");

        Iterator it = list2.iterator();
        while (it.hasNext())
            System.out.println(it.next());

        Collections.sort(list2);
        System.out.println(list2);
        List list = new ArrayList();
        list = list2;

        ConnectDB con = new ConnectDB();
        con.createTableFromStringToMySql("Players","Name");

        con.InsertDataFromArrayListToMySql(list, "Players", "Name");

        List<String> num = con.readDataBase("Players", "Name");
        for (String st : num) {
            System.out.println(st);
        }
    }
}
