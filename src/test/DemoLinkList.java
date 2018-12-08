package test;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Collection.*;

public class DemoLinkList {

    public static void main(String[] args) {

        List<String>linkList= new LinkedList<String>();
        linkList.add("me");
        linkList.add("you");
        linkList.add("He");

        System.out.println("");
        for(int i=0; i< linkList.size(); i++) {
            System.out.println("for loop "+linkList.get(i));
        }
        int i= 0;
        while(i<linkList.size()){
            System.out.println("While loop "+linkList.get(i));
        i++;
        }

        for (String temp : linkList){
            System.out.println("Enhanced for loop "+temp);
        }
        Iterator itarator = linkList.iterator();
        while (itarator.hasNext()){
            System.out.println("Iterator "+itarator.next());
        }

        linkList.forEach((temp) -> {
            System.out.println("For each loop "+temp);
        });

    }

}
