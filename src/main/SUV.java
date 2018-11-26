package main;

public class SUV {
    int age = 1;
    int passengerNumber = 100;
    int gear = 3;
    int cargo = 2000;
    int speed = 150;

    public void increaseSpeed(int amount) {
        speed = speed + amount;
        System.out.println("This increases the SUV speed");
    }

    public void addPassengers(int amount) {
        passengerNumber = passengerNumber + amount;
        System.out.println("This increases the number of passengers in the SUV");
    }

    public void unloadCargo(int amount) {
        cargo = cargo - amount;
        System.out.println("This reduces the units of cargo in the SUV");
    }

    public void changeGear(int newValue) {
        gear = newValue;
        System.out.println("This changes the SUV gear");
    }

    public void brake(int amount) {
        speed = 0;
        gear = 1;
        System.out.println("This sets the speed to 0");
    }
}


