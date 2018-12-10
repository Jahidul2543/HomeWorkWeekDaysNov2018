package com.trainingdays;

public class PolymophrismRunTime {
    void run(){
        System.out.println("car is running");
    }

}

 class SkateBoard extends PolymophrismRunTime{

    void run(){
        System.out.println("Skate is running 20km");
    }
}

class Bike extends PolymophrismRunTime{

//    void run(){
//        System.out.println("Bike is running 40km");
//    }
    void run(){
        super.run();
        System.out.println("Adding values");
    }

    public static void main(String[] args) {
        PolymophrismRunTime bik = new PolymophrismRunTime();
        PolymophrismRunTime bik1 = new Bike();
        PolymophrismRunTime skate = new SkateBoard();

        bik.run();
        bik1.run();
        skate.run();
        System.out.println( bik1  instanceof PolymophrismRunTime);

    }

}
