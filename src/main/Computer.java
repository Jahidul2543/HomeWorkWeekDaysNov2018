package main;

public class Computer {
    boolean on = false;
    int age = 0;
    int volume = 10;
    int screenBrightness = 5;
    boolean airplaneModeOn = false;

    public void turnOn() {
        on = true;
        System.out.println("This turns on computer");
    }

    public void setVolume(int vol) {
        volume = vol;
        System.out.println("This sets the volume");
    }

    public void setScreenBrightness(int brightness) {
        screenBrightness = brightness;
        System.out.println("This sets the screen brightness");
    }

    public void turnOnAirplaneMode () {
        airplaneModeOn = true;
        System.out.println("This turns on airplane mode");
    }

    public void setAge(int years) {
        age = years;
        System.out.println("This sets the age");
    }
}

