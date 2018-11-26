package main;

public class Chips {
    int number = 10;
    boolean unbaked = false;
    String texture = "crispy";
    boolean warm = true;
    String taste = "delicious";

    public void eat(int newValue) {
        number = newValue;
        System.out.println("This decreases the amount of chips");
    }

    public void bake() {
        unbaked = false;
        System.out.println("This bakes the chips");
    }

    public void addExtraButter() {
        texture = "crispy";
        System.out.println("This changes the texture of the chips");
    }

    public void addSalt() {
        taste = "delicious";
        System.out.println("This improves the taste of the chips");
    }

    public void crush() {
        texture = "crumbly";
        System.out.println("This changes the texture of the chips");
    }
}
