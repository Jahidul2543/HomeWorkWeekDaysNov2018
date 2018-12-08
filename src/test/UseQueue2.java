package test;

import java.sql.Connection;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class UseQueue2 {

    public static void main(String[] args) {

        Queue<Integer> newQ = new LinkedList<>();
        newQ.add(60);
        newQ.add(70);
        newQ.add(100);
        newQ.add(101);


        System.out.println(newQ.peek());
        System.out.println(newQ.poll());

for(Integer in : newQ) {
    System.out.println(in);
}

Iterator itr = newQ.iterator();
while ( itr.hasNext()){
    Integer i = (Integer) itr.next();
    System.out.println(i);
}
        ConnectDB connectDB = new ConnectDB();
connectDB.createTableFromStringToMySql("rrr", "rr");

    }
}
