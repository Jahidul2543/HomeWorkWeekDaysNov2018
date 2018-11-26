package main;

public class Cake {
    int number = 10;
    boolean unbaked = false;
    String texture = "soft";
    boolean warm = true;
    String taste = "delicious";

    public void eat(int newValue) {
        number = newValue;
        System.out.println("This decreases the number of cakes");
    }

    public void bake() {
        unbaked = false;
        System.out.println("This bakes the cake");
    }

    public void addExtraButter() {
        texture = "dense";
        System.out.println("This changes the texture of the cake");
    }

    public void addSugar() {
        taste = "delicious";
        System.out.println("This improves the taste of the cake");
    }

    public void microwave() {
        warm = true;
        System.out.println("This warms up the cake");
    }
}
