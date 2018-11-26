package main;

public class TV {
    boolean on = false;
    int age = 0;
    int volume = 10;
    int screenBrightness = 5;
    int channel = 1;

    public void turnOn() {
        on = true;
        System.out.println("This turns on TV");
    }

    public void setVolume(int vol) {
        volume = vol;
        System.out.println("This sets the volume");
    }

    public void setScreenBrightness(int brightness) {
        screenBrightness = brightness;
        System.out.println("This sets the screen brightness");
    }

    public void setChannel (int chan) {
        channel = chan;
        System.out.println("This sets the channel");
    }

    public void setAge(int years) {
        age = years;
        System.out.println("This sets the age");
    }
}

