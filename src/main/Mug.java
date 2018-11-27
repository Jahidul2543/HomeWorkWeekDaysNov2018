package main;

public class Mug {

    String name;
    String color;
    int size;
    int amount;

    public Mug() {
    }

    public Mug(String name, String color) {
    }

    public Mug(String name, String color, int size, int amount) {
        this.name = name;
        this.color = color;
        this.size = size;
        this.amount = amount;

    }

    public void mugInfo() {
        System.out.println("this mug have different color" + name + " " + color + " " + size + " " + amount);

    }

    public static void main(String[] args) {

        Mug shakh = new Mug("shakh", "Red", 5, 2);
        Mug Shakib = new Mug("shakib", "yellow", 4, 1);
        Mug Fahmida = new Mug("Fahmida", "Blue", 3, 3);
        Mug dad= new Mug("Dad","white");

        shakh.mugInfo();
        Shakib.mugInfo();
        Fahmida.mugInfo();
        dad.mugInfo();


    }

}

