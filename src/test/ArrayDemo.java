package test;

import java.io.IOException;
import java.util.ArrayList;

public class ArrayDemo {

    public static void main(String[] args)
        throws IOException {

        int n=5;

        ArrayList<Integer>arrayD= new ArrayList<Integer>(n);

        for (int i=1; i<=n; i++)
        arrayD.add(i);
        System.out.println(arrayD);

        arrayD.remove(3);
        System.out.println(arrayD);

        for(int i=0; i<arrayD.size();i++)
        System.out.println(arrayD.get(i)+ " ");


        }


    }


