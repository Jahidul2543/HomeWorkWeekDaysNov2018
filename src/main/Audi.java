package main;

public class Audi extends Jeep {
    /*public static void main(String[] args) {

        Acura tlx = new Acura();
        tlx.setTotalCapacity(5);
        System.out.println("My TLX has" + tlx.getTotalCapacity() + "seats");

        Acura sfx = new Acura();
        sfx.setTotalCapacity(7);
        System.out.println("My SFX has" + sfx.getTotalCapacity() + "seats");

        Acura.carIdentity();


        }*/
    /*public static int getJeepCapacity() {
        return jeepCapacity;*/

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