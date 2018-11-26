package main;

public class BakedGoods {
    int number = 10;
    boolean unbaked = false;
    String texture = "crunchy";
    boolean warm = true;
    String taste = "delicious";

    public void eat(int newValue) {
        number = newValue;
        System.out.println("This decreases the number of baked goods");
    }

    public void bake() {
        unbaked = false;
        System.out.println("This bakes the baked goods");
    }

    public void addExtraButter() {
        texture = "chewy";
        System.out.println("This changes the texture of the baked goods");
    }

    public void addSugar() {
        taste = "delicious";
        System.out.println("This improves the taste of the baked goods ");
    }

    public void microwave() {
        warm = true;
        System.out.println("This warms up the baked goods");
    }
}
