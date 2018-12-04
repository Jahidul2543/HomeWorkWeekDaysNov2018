package Homework.Homework1;

public class Animals {
    String name;
    String breed;
    int numberOfLegs;


    public void dogsBark() {
        System.out.println("Hi i am " + name + " I am from breed " + breed + " and i have " + numberOfLegs + " legs");

    }

    public Animals(String name, String breed, int numberOfLegs) {

        this.name = name;
        this.breed = breed;
        this.numberOfLegs = numberOfLegs;
    }

    public static void main(String[] args) {


        Animals dog = new Animals("Jacky", "Bulldog", 4);
        dog.dogsBark();

    }

}