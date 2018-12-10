package com.trainingdays;

public class InstanceInitilizerBlock {
    String  outerNumber = "Hey from OuterClass";


    class Inner extends InstanceInitilizerBlock{

        String innerNumber = "Hey from InnerClass";



    }

    public static void main(String[] args) {

        InstanceInitilizerBlock outer = new InstanceInitilizerBlock();
        InstanceInitilizerBlock.Inner obj1 = outer.new Inner();
        System.out.println(obj1.outerNumber);
        System.out.println(obj1.innerNumber);

    }


}
