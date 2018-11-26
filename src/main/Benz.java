package main;

public class Benz {

    int orderAmount=20;
    int sold= 5;
    int newInventory= orderAmount-sold;
    int returnInventory= orderAmount+sold;

    public void inventory() {
        System.out.println("We have" +newInventory+" cars ");
    }
    public void caravanInventory(){
        System.out.println("We have" + returnInventory + "returned cars");
    }
    public static void main(String[]args) {
        Benz matic = new Benz();
        Benz magic = new Benz();
        Benz tomy = new Benz();
        Benz caravan = new Benz();
        Benz sedan = new Benz();

     matic.inventory();
     magic.inventory();
     tomy.inventory();
     caravan.caravanInventory();
     sedan.inventory();

    }
}
