package main;

public class Bmw {

    int id;
    int price;
    String storeName;

    public void carInfo(){
        System.out.println("Car Id " + id + " Price " + price + " Store " + storeName );
    }

public static void main(String[]args){

    Bmw x5 = new Bmw();
    x5.id=111;
    x5.price=50000;
    x5.storeName="Nostrand";
    Bmw m4 = new Bmw();
    m4.id=1123;
    m4.price=60000;
    m4.storeName="Bay Ridge";
    Bmw m5 = new Bmw();
    m5.id=1114;
    m5.price=40000;
    m5.storeName="Queens";
    Bmw x3 = new Bmw();
    x3.id=1118;
    x3.price=70000;
    x3.storeName="Nostrand";
    Bmw x7 = new Bmw();
    x7.id=1119;
    x7.price=80000;
    x7.storeName="Bay Ridge";

    x5.carInfo();
    m4.carInfo();
    m5.carInfo();
    x3.carInfo();
    x7.carInfo();


}

}
