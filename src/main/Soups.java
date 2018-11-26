package main;

public class Soups {
    int amount = 100;
    boolean uncooked = false;
    String texture = "thick";
    boolean warm = true;
    String taste = "delicious";

    public void eat(int newValue) {
        amount = newValue;
        System.out.println("This decreases the amount of soup");
    }

    public void cook() {
        uncooked = false;
        System.out.println("This cooks the soup");
    }

    public void addExtraButter() {
        texture = "silky";
        System.out.println("This changes the texture of the soup");
    }

    public void addSalt() {
        taste = "delicious";
        System.out.println("This improves the taste of the soup");
    }

    public void microwave() {
        warm = true;
        System.out.println("This heats up the soup");
    }
}
