
public class Classcomposition {

    public static void main(String arg[]) {
        Room hall = new Room("Hall");
        hall.area = 200.0;
        hall.paintColor = "Voilet";
        hall.flooring = "Marble";

        hall.ceilingFan = new Fan("Bajaj");
        hall.ceilingFan.speed = 500;
        hall.ceilingFan.numberOfSpeeds = 5;

        hall.tube = new Light("Hall tube light");
        hall.tube.color = "White";
        hall.tube.watts = 40;
        hall.tube.tube = true;

        Light bl = new Light("Yellow bed light");
        hall.bedLight = bl;
        hall.bedLight.color = "Yellow";
        hall.bedLight.watts = 50;
        hall.bedLight.tube = false;

        System.out.println("Hall fan speed : " + hall.ceilingFan.speed);
        System.out.println("Bed Light color : " + hall.bedLight.color);
    }
}

class Fan
{
    String name;
    double speed;
    String color;
    int numberOfSpeeds;

    Fan(String name)
    {
        this.name = name;
    }
}

class Light
{
    String name;
    String color;
    int watts;
    boolean tube;

    Light(String name)
    {
        this.name = name;
    }
}

class Room
{
    String name;
    double area;
    String paintColor;
    String flooring;
    Fan ceilingFan;
    Light tube;
    Light bedLight;

    Room(String name)
    {
        this.name = name;
    }
}