package main;

public class Pot {
    boolean hot = false;
    String color = "red";
    int fluidLevel = 0;
    boolean full = false;
    boolean empty = true;



    public void fillMax() {
        full = true;
        fluidLevel = 100;
        empty = false;
        System.out.println("This fills pot to the max capacity.");

    }

    public void fill(int amount) {
        fluidLevel = fluidLevel + amount;
        if (fluidLevel >= 100) {
            fluidLevel = 100;
            full = true;
        }
        if (fluidLevel > 0) {
            empty = false;
            System.out.println("This fills pot to a specific amount.");
        }
    }

    public void drink(int amount) {
        fluidLevel = fluidLevel - amount;
        if (fluidLevel < 100) {
            full = false;
        }
        if (fluidLevel <= 0) {
            fluidLevel = 0;
            empty = true;
            System.out.println("This indicates drinking from the pot.");
        }
    }

    public void chug () {
        fluidLevel = 0;
        empty = true;
        full = false;
        System.out.println("This indicates drinking all the fluid from the pot very quickly.");
    }

    public void heat () {
        hot = true;
        System.out.println("This heats the pot.");
    }




}

