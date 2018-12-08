package test;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class DemoLinkedList3 {

    public static void main(String[] args) throws SQLException, ClassCastException, IOException, ClassNotFoundException {

        List<Integer>list2 = new LinkedList<Integer>();
        list2.add(56);
        list2.add(57);

        for (int i=0;i< list2.size();i++){
            System.out.println(list2.get(i));
        }
 int i=0;
        while (i<list2.size()){
            System.out.println(list2.get(i));
            i++;
        }
for ( Integer f : list2){
    System.out.println(f);
}

        Iterator j = list2.iterator();
        while(j.hasNext()){
            System.out.println(j.next());
        }

        list2.forEach((temp) ->
                System.out.println(temp));


//Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb" ,"root","a0704");
ConnectDB con = new ConnectDB();
con.connectToMySql();
//con.createTableFromStringToMySql("td", "ld");
//con.InsertDataFromArrayListToMySql(list2,"td","ld");


    }

}