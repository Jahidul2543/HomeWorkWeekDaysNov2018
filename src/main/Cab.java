package main;

public class Cab {
    int age = 1;
    int passengerNumber = 100;
    int gear = 3;
    int cargo = 2000;
    int speed = 150;

    public void increaseSpeed(int amount) {
        speed = speed + amount;
        System.out.println("This increases the cab speed");
    }

    public void addPassengers(int amount) {
        passengerNumber = passengerNumber + amount;
        System.out.println("This increases the number of passengers in the cab");
    }

    public void unloadCargo(int amount) {
        cargo = cargo - amount;
        System.out.println("This reduces the units of cargo in the cab");
    }

    public void changeGear(int newValue) {
        gear = newValue;
        System.out.println("This changes the cab gear");
    }

    public void brake(int amount) {
        speed = 0;
        gear = 1;
        System.out.println("This sets the speed to 0");
    }
}

