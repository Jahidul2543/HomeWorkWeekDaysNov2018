package com.trainingdays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Algirithms {

    public static void main(String[] args) {

//        String[] myArray = new String[]{"bob", "alice", "paul", "ellie"};
//        Stream<String> myStream = Arrays.stream(myArray);
//
//        Stream<String> myNewStream =
//                myStream.map(s -> s.toUpperCase());
//
//
//        String[] myNewArray = myNewStream.toArray(String[]::new);
//
//        for (int i = 0; i <myNewArray.length ; i++) {
//            System.out.println(myNewArray[i]);
//
//        }

         int numbers[]= {1,-1,5,-2,4,-6};

        numbers = Arrays.stream(numbers).filter(x->x>0).toArray();

        




    }


}
