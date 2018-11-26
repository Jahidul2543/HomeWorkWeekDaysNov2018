package main;

public class MainDish {
    int amount = 100;
    boolean uncooked = false;
    String texture = "silky";
    boolean warm = true;
    String taste = "delicious";

    public void eat(int newValue) {
        amount = newValue;
        System.out.println("This decreases the amount of main dish remaining");
    }

    public void cook() {
        uncooked = false;
        System.out.println("This cooks the main dish");
    }

    public void addExtraButter() {
        texture = "silky";
        System.out.println("This changes the texture of the main dish");
    }

    public void addSalt() {
        taste = "delicious";
        System.out.println("This improves the taste of the main dish");
    }

    public void microwave() {
        warm = true;
        System.out.println("This heats up the main dish");
    }
}

