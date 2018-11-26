package main;

import main.Mug;

public class Homework1 {
    public static void main(String[] args) {

        // 1. Mug class objects
        Mug beerMug = new Mug();
        Mug coffeeMug = new Mug();
        Mug teaMug = new Mug();
        Mug cornellMug = new Mug();
        Mug workMug = new Mug();

        beerMug.fillMax();
        coffeeMug.fill(50);
        coffeeMug.heat();
        teaMug.fill(100);
        teaMug.heat();
        cornellMug.fillMax();
        cornellMug.drink(20);
        workMug.fillMax();
        workMug.chug();

        // 2. Phone class objects
        Phone iPhone8 = new Phone();
        Phone iPhone9 = new Phone();
        Phone googlePixel2 = new Phone();
        Phone googlePixel3 = new Phone();
        Phone galaxyS8 = new Phone();

        iPhone8.setAge(1);
        iPhone9.setScreenBrightness(9);
        googlePixel2.turnOn();
        googlePixel3.turnOnAirplaneMode();
        galaxyS8.setVolume(5);

        //3. Computer class objects
        Computer asus = new Computer();
        Computer  macBookPro = new Computer();
        Computer  hp = new Computer();
        Computer lenovo = new Computer();
        Computer surface = new Computer();

        asus.setAge(1);
        macBookPro.setScreenBrightness(9);
        hp.turnOn();
        lenovo.turnOnAirplaneMode();
        surface.setVolume(5);

        //4. Tablet class objects
        Tablet iPad = new Tablet();
        Tablet iPadPro = new Tablet();
        Tablet galaxyTab = new Tablet();
        Tablet nexus = new Tablet();
        Tablet surfaceMini = new Tablet();

        iPad.setAge(1);
        iPadPro.setScreenBrightness(9);
        galaxyTab.turnOn();
        nexus.turnOnAirplaneMode();
        surfaceMini.setVolume(5);

        //5. Bowl class objects
        Bowl mushroomSoup = new Bowl();
        Bowl beefBroth = new Bowl();
        Bowl chickenSoup = new Bowl();
        Bowl broccoliCheddar = new Bowl();
        Bowl miso = new Bowl();

        mushroomSoup.fillMax();
        beefBroth.drink(20);
        chickenSoup.heat();
        broccoliCheddar.fill(10);
        miso.chug();

        //6. Bottle class objects
        Bottle glassBottle = new Bottle();
        Bottle plasticBottle = new Bottle();
        Bottle aluminiumBottle = new Bottle();
        Bottle sportBottle = new Bottle();
        Bottle babyBottle = new Bottle();

        glassBottle.heat();
        plasticBottle.chug();
        aluminiumBottle.fillMax();
        sportBottle.drink(10);
        babyBottle.fill(20);

        //7. TV class objects
        TV sharp = new TV();
        TV apple = new TV();
        TV samsung = new TV();
        TV sony = new TV();
        TV vizio = new TV();

        sharp.setAge(3);
        apple.setChannel(5);
        samsung.turnOn();
        sony.setScreenBrightness(9);
        vizio.setVolume(8);

        //8. SmartWatch class objects
        SmartWatch appleWatch = new SmartWatch();
        SmartWatch samsungWatch = new SmartWatch();
        SmartWatch skagen = new SmartWatch();
        SmartWatch fitbit = new SmartWatch();
        SmartWatch garmin = new SmartWatch();

        apple.setAge(2);
        samsung.turnOn();
        skagen.setScreenBrightness(5);
        fitbit.setVolume(6);
        garmin.turnOnAirplaneMode();

        //9. Pot class objects
        Pot soupPot = new Pot();
        Pot gravyPot = new Pot();
        Pot curryPot = new Pot();
        Pot stewPot = new Pot();
        Pot stockPot = new Pot();

        soupPot.fill(10);
        gravyPot.fillMax();
        curryPot.heat();
        stewPot.fill(50);
        stockPot.heat();

        //10. MusicPlayer class objects
        MusicPlayer sandisk = new MusicPlayer();
        MusicPlayer iPod = new MusicPlayer();
        MusicPlayer zune = new MusicPlayer();
        MusicPlayer itouch = new MusicPlayer();
        MusicPlayer iPodMini = new MusicPlayer();

        sandisk.setAge(10);
        iPod.turnOn();
        zune.setVolume(6);
        itouch.setScreenBrightness(3);
        iPodMini.turnOn();








    }
}
