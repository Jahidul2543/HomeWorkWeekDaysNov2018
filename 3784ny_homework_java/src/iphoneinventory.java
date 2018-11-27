package main;

public class iphoneinventory {

    int orderAmount=1050;
    int sold= 450;
    int newInventory= orderAmount-sold;
    int returnInventory= orderAmount+sold;

    public void inventory() {
        System.out.println("We have " +newInventory+" Iphone ");
    }
    public void Iphone7plusinventory(){
        System.out.println("We have " + returnInventory + " returned Iphone7plus ");
    }
    public static void main(String[]args) {
        iphoneinventory Iphonexr = new iphoneinventory();
        iphoneinventory Iphonexs = new iphoneinventory();
        iphoneinventory Iphonexsmax = new iphoneinventory();
        iphoneinventory Iphone7plus = new iphoneinventory();
        iphoneinventory Iphone8plus = new iphoneinventory();

        Iphonexr.inventory();
        Iphonexs.inventory();
        Iphonexsmax.inventory();
        Iphone7plus.Iphone7plusinventory();
        Iphone8plus.inventory();

    }
}
