package com.trainingdays;


            //instance initializer block
public class RealInstanceInitilizeBLock {


    RealInstanceInitilizeBLock(){
        System.out.println("Parent constructor");
    }

    }



 class ChildOfRealInstance extends RealInstanceInitilizeBLock{

        ChildOfRealInstance(){
            super();
            System.out.println("Child constructor");
        }
     {
         System.out.println("Instance inizilizer block was invoked vasya");
     }




    public static void main(String[] args) {

        ChildOfRealInstance obj2 = new ChildOfRealInstance();



    }


}


