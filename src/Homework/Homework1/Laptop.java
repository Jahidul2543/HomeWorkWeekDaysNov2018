package Homework.Homework1;

public class Laptop {
    String name;
    int price;
     boolean on=false;

    public void turnOntheLaptop() {
        System.out.println("With this method we will turn on the laptop");

    }

    public Laptop(String name, int price,boolean on){
        this.name=name;
        this.price=price;
        this.on=on;
    }

    public static void main(String[] args) {
        Laptop myLaptop=new Laptop("Dell",700,false);
        myLaptop.turnOntheLaptop();
    }
    }

