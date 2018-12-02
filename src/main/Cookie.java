package main;

public class Cookie {
    int number = 10;
    boolean unbaked = false;
    String texture = "crunchy";
    boolean warm = true;
    String taste = "delicious";

    public void eat(int newValue) {
        number = number - newValue;
        System.out.println("This is how many cookies remain after eating: " + number);
    }

    public void bake() {
        unbaked = false;
        System.out.println("This bakes the cookie");
    }

    public void addExtraButter() {
        texture = "chewy";
        System.out.println("This changes the texture of the cookie");
    }

    public void addSugar() {
        taste = "delicious";
        System.out.println("Adding sugar makes it " + taste);
    }

    public void microwave() {
        warm = true;
        System.out.println("This warms up the cookie");
    }

}