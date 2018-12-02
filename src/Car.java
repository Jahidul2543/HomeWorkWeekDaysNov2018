public class Car {

    String name;
    String model;
    int speed;

    public void fullSpeed() {
        System.out.println("Car is going at full speed");
    }

    public void exactSpeed(int speed) {
        System.out.println("Exact speed of the car"+speed);

    }

    public void carStopped(int speed){
        System.out.println("Car is stopped"+speed);

    }

    public static void main(String[] args) {
        Car myCar=new Car();
        myCar.model= "Altima";
        myCar.name= "Nissan";
        myCar.speed=70;

        myCar.fullSpeed();
        myCar.exactSpeed(70);
        myCar.carStopped(0);

    }

    }
