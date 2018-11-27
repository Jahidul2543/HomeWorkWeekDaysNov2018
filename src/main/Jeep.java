package main;

public class Jeep {


    public static int jeepCapacity;

    public static void setJeepCapacity(int jeepCapacity) {
        Jeep.jeepCapacity = jeepCapacity;
    }

    public static int getJeepCapacity() {
        return jeepCapacity;
    }
    public static void main(String[]args){

        Jeep cherokee = new Jeep();
        cherokee.setJeepCapacity(5);
        System.out.println("My car has " +getJeepCapacity()+ " seats");
        Jeep sedan = new Jeep();
        sedan.setJeepCapacity(4);
        System.out.println("My car has " +getJeepCapacity()+ " seats");
        Jeep van = new Jeep();
        van.setJeepCapacity(7);
        System.out.println("My car has " +getJeepCapacity()+ " seats");


    }

}
