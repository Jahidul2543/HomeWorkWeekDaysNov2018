package main;

import sun.applet.Main;

public class Homework1 {
    public static void main(String[] args) {

        // 1. Mug class objects
        Mug beerMug = new Mug();
        Mug coffeeMug = new Mug();
        Mug teaMug = new Mug();
        Mug cornellMug = new Mug();
        Mug workMug = new Mug();
        Mug newMug = new Mug();


        beerMug.fillMax();
        coffeeMug.fill(50);
        coffeeMug.heat();
        teaMug.fill(100);
        teaMug.heat();
        cornellMug.fillMax();
        cornellMug.drink(20);
        workMug.fillMax();
        workMug.chug();
        beerMug.chug();
        newMug.chug();

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

        //11. Train class objects
        Train nTrain = new Train();
        Train gTrain = new Train();
        Train train7 = new Train();
        Train train1 = new Train();
        Train train2 = new Train();

        nTrain.addPassengers(30);
        gTrain.brake(0);
        train7.changeGear(4);
        train1.unloadCargo(100);
        train2.increaseSpeed(50);

        //12. Bus class objects
        Bus greyhound = new Bus();
        Bus peterPan = new Bus();
        Bus megaBus = new Bus();
        Bus ourBus = new Bus();
        Bus trailways = new Bus();

        greyhound.addPassengers(50);
        peterPan.brake(0);
        megaBus.changeGear(6);
        ourBus.unloadCargo(300);
        trailways.increaseSpeed(20);

        //13. Cab class objects
        Cab uber = new Cab();
        Cab lyft = new Cab();
        Cab yellowCab = new Cab();
        Cab blackTaxi = new Cab();
        Cab curb = new Cab();

        uber.addPassengers(2);
        lyft.brake(0);
        yellowCab.changeGear(3);
        blackTaxi.unloadCargo(20);
        curb.increaseSpeed(10);

        //14. Sedan class objects
        Sedan hondaAccord = new Sedan();
        Sedan toyotaCamry = new Sedan();
        Sedan nissanAltima = new Sedan();
        Sedan hyundaiElantra = new Sedan();
        Sedan mercedesC300 = new Sedan();

        hondaAccord.addPassengers(3);
        toyotaCamry.brake(0);
        nissanAltima.changeGear(2);
        hyundaiElantra.unloadCargo(2);
        mercedesC300.increaseSpeed(5);

        //15. SUV class objects
        SUV hondaPilot = new SUV();
        SUV toyotaHighlander = new SUV();
        SUV nissanMurrano = new SUV();
        SUV hyundaiTucson= new SUV();
        SUV mercedesGlk = new SUV();

        hondaPilot.addPassengers(5);
        toyotaHighlander.brake(0);
        nissanMurrano.changeGear(2);
        hyundaiTucson.unloadCargo(3);
        mercedesGlk.increaseSpeed(15);

        //16. Cookie class objects
        Cookie chocolateChipCookie = new Cookie();
        Cookie oatmealRaisinCookie = new Cookie();
        Cookie shortbreadCookie = new Cookie();
        Cookie mmCookie = new Cookie();
        Cookie macadamiaCookie = new Cookie();

        chocolateChipCookie.addExtraButter();
        oatmealRaisinCookie.addSugar();
        shortbreadCookie.eat(9);
        mmCookie.microwave();
        macadamiaCookie.bake();

        //17. Cake class objects
        Cake germanChocolateCake = new Cake();
        Cake blackForestCake = new Cake();
        Cake doubleChocolateCake = new Cake();
        Cake tresLecheCake = new Cake();
        Cake caramelCake = new Cake();

        germanChocolateCake.addExtraButter();
        blackForestCake.addSugar();
        doubleChocolateCake.microwave();
        tresLecheCake.eat(2);
        caramelCake.bake();

        //18. Chips class objects
        Chips sourCreamOnionChips = new Chips();
        Chips cheddarChips = new Chips();
        Chips jalapenoChips = new Chips();
        Chips rufflesChips = new Chips();
        Chips doritosChips = new Chips();

        sourCreamOnionChips.addExtraButter();
        jalapenoChips.addSalt();
        cheddarChips.bake();
        rufflesChips.crush();
        doritosChips.eat(5);

        //19. Soups class objects
        Soups broccoliCheddarSoup = new Soups();
        Soups creamOfMushroomSoup = new Soups();
        Soups wildRiceSoup = new Soups();
        Soups tomYumSoup = new Soups();
        Soups lentilSoup = new Soups();

        broccoliCheddarSoup.addExtraButter();
        creamOfMushroomSoup.addSalt();
        wildRiceSoup.cook();
        tomYumSoup.eat(50);
        lentilSoup.microwave();

        //20. MainDish class objects
        MainDish chickenParmesan = new MainDish();
        MainDish chickenPiccata = new MainDish();
        MainDish vealCutlet = new MainDish();
        MainDish ribeyeSteak = new MainDish();
        MainDish beefBarleyStew = new MainDish();

        chickenParmesan.addExtraButter();
        vealCutlet.cook();
        ribeyeSteak.addExtraButter();
        chickenPiccata.microwave();
        beefBarleyStew.eat(50);
    }
}
