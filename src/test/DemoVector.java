package test;

import java.util.Enumeration;
import java.util.Vector;

public class DemoVector {

    public static void main(String[] args) {

        Vector<String> vec = new Vector<String>();


        vec.add("rex");
        vec.add("vex");
        vec.addElement("Elephant");


        System.out.println(vec.capacity());
        System.out.println(vec.size());
        System.out.println(vec);

        vec.addElement("fruit");
        vec.add("tax");

        System.out.println(vec.size());
        System.out.println(vec.capacity());

        Enumeration en = vec.elements();
        System.out.println("");

        while(en.hasMoreElements()){
            System.out.println(en.nextElement());
        }





    }

}
